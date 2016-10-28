package individues;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import instructions.Instruction;
import runtime.RuntimeContext;

public class Function {
	
    private static final AtomicLong NEXT_ID = new AtomicLong(0);
    private final long id = NEXT_ID.getAndIncrement();

    public long getId() {
         return id;
    }
	
	List<Instruction> instructions;

	int numberOfArgs;
	
	Function() {
		super();
		numberOfArgs = 1;
	}
	
	Function(int numberOfArgs) {
		if (numberOfArgs < 1) throw new IndexOutOfBoundsException();
		this.numberOfArgs = numberOfArgs;
	}
	
	public List<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
	}
	
	public void increaseArgs() {
		++numberOfArgs;
	}
	
	public void run(RuntimeContext context) {
		for (int i = 0; i < instructions.size(); ++i) {
			context.getInternalContext().setCurrentInstruction(i);
			instructions.get(i).run(context);
			i = context.getInternalContext().getCurrentInstruction();
		}
	};
}

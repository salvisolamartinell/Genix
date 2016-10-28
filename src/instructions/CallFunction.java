package instructions;

import java.util.List;

import individues.Function;
import individues.Input;
import individues.Output;
import runtime.InternalContext;
import runtime.RuntimeContext;

public class CallFunction implements Instruction {

	Function function;
	List<Integer> stripNums;
	
	@Override
	public void run(RuntimeContext context) {
		InternalContext internalContext = new InternalContext();
		internalContext.setStrips(context.getInternalContext().getStrips(stripNums));
		Input input = context.getInput();
		Output output = context.getOutput();
		RuntimeContext transferedContext = new RuntimeContext(internalContext, input, output);
		function.run(transferedContext);			
	}
	
}

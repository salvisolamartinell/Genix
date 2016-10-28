package instructions;

import runtime.RuntimeContext;

public class AssignToOutput implements Instruction {

	AssignToOutput(int stripIndex, int setIndex) {
		this.stripIndex = stripIndex;
		this.setIndex = setIndex;
	}
	
	private int setIndex;
	private int stripIndex;

	@Override
	public void run(RuntimeContext context) {
		context.getOutput().set(setIndex, context.getInternalContext().getStrip(stripIndex).getValue());	
	}

}

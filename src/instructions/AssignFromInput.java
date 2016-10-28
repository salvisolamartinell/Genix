package instructions;

import runtime.RuntimeContext;

public class AssignFromInput implements Instruction {

	AssignFromInput(int getIndex, int stripIndex) {
		this.getIndex = getIndex;
		this.stripIndex = stripIndex;
	}
	
	private int getIndex;
	private int stripIndex;

	@Override
	public void run(RuntimeContext context) {
		context.getInternalContext().getStrip(stripIndex).setValue(context.getInput().get(getIndex));
		
	}

}

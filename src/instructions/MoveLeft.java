package instructions;

import runtime.InternalContext;

public class MoveLeft extends InternalInstruction {

	MoveLeft(int stripNum) {
		this.stripNum = stripNum;
	}
	
	private int stripNum;
	
	@Override
	public void run(InternalContext context) {
		context.getStrip(stripNum).moveLeft();
	}

}

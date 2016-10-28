package instructions;

import runtime.InternalContext;

public class MoveRight extends InternalInstruction {

	MoveRight(int stripNum) {
		this.stripNum = stripNum;
	}
	
	private int stripNum;
	
	@Override
	public void run(InternalContext context) {
		context.getStrip(stripNum).moveRight();
	}

}

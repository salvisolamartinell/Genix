package instructions;

import runtime.InternalContext;

public class MoveToOrigin extends InternalInstruction {

	MoveToOrigin(int stripNum) {
		this.stripNum = stripNum;
	}
	
	private int stripNum;
	
	@Override
	public void run(InternalContext context) {
		context.getStrip(stripNum).moveToOrigin();
	}

}

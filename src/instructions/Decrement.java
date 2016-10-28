package instructions;

import runtime.InternalContext;

public class Decrement extends InternalInstruction {

	Decrement(int stripNum) {
		this.stripNum = stripNum;
	}
	
	private int stripNum;
	
	@Override
	public void run(InternalContext context) {
		context.getStrip(stripNum).decrement();
	}

}

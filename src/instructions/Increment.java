package instructions;

import runtime.InternalContext;

public class Increment extends InternalInstruction {

	Increment(int stripNum) {
		this.stripNum = stripNum;
	}
	
	private int stripNum;
	
	@Override
	public void run(InternalContext context) {
		context.getStrip(stripNum).increment();
	}

}

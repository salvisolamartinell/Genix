package instructions;

import runtime.InternalContext;

/**
 *	Next instruction will be run only if the value of the selected strip is not zero.
 */
public class IfCondition extends InternalInstruction {
	
	private int stripNum;

	IfCondition(int stripNum) {
		this.stripNum = stripNum;
	}
	
	@Override
	public void run(InternalContext context) {
		if (context.getStrip(stripNum).getValue() == 0) {
			context.setCurrentInstruction(context.getCurrentInstruction() + 1);
		};
	}

}

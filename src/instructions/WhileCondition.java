package instructions;

import runtime.InternalContext;

/**
 *	Previous instruction will be run again and again until the value of the selected strip is zero.
 */
public class WhileCondition extends InternalInstruction {
	
	private int stripNum;

	WhileCondition(int stripNum) {
		this.stripNum = stripNum;
	}
	
	@Override
	public void run(InternalContext context) {
		if (context.getStrip(stripNum).getValue() == 0) {
			if (context.getCurrentInstruction() > 0) {
				context.setCurrentInstruction(context.getCurrentInstruction() - 2);
			}
		};
	}

}

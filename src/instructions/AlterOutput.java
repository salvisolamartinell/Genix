package instructions;

import runtime.RuntimeContext;

public class AlterOutput implements Instruction {

	AlterOutput(int alterNum) {
		this.alterNum = alterNum;
	}
	
	private int alterNum;
	
	@Override
	public void run(RuntimeContext context) {
		context.getOutput().alter(alterNum);
	}

}

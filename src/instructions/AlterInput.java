package instructions;

import runtime.RuntimeContext;

public class AlterInput implements Instruction {

	AlterInput(int alterNum) {
		this.alterNum = alterNum;
	}
	
	private int alterNum;
	
	@Override
	public void run(RuntimeContext context) {
		context.getInput().alter(alterNum);
	}

}

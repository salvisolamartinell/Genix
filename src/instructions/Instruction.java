package instructions;

import runtime.RuntimeContext;

public interface Instruction {
	void run(RuntimeContext context);
}

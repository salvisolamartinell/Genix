package instructions;

import runtime.InternalContext;
import runtime.RuntimeContext;

public abstract class InternalInstruction implements Instruction {
	
	public abstract void run(InternalContext internalContext);
	
	public final void run(RuntimeContext context) {
		run(context.getInternalContext());
	};
}

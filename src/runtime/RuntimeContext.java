package runtime;

import individues.Input;
import individues.Output;

public class RuntimeContext {
	private InternalContext internalContext;
	private Input input;
	private Output output;

	public RuntimeContext(InternalContext internalContext, Input input, Output output) {
		this.internalContext = internalContext;
		this.input = input;
		this.output = output;
	}
	
	public InternalContext getInternalContext() {
		return internalContext;
	}

	public void setInternalContext(InternalContext internalContext) {
		this.internalContext = internalContext;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}
}

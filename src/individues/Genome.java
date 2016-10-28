package individues;

import java.util.List;

public class Genome {
	
	private Function mainFunction;
	private List<Function> functions;

	public Function getMainFunction() {
		return mainFunction;
	}
	
	public void setMainFunction(Function mainFunction) {
		this.mainFunction = mainFunction;
	}
	
	public List<Function> getFunctions() {
		return functions;
	}
	
	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

}

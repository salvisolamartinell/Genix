package individues;

import java.util.ArrayList;

import runtime.InternalContext;
import runtime.MapStrip;
import runtime.RuntimeContext;
import runtime.Strip;

public class Individual<I extends Input, O extends Output> {
	
	private Genome genome;
	
	O run(I input, O output) {
		InternalContext internalContext = new InternalContext();
		internalContext.setCurrentInstruction(0);
		ArrayList<Strip> strips = new ArrayList<>();
		strips.add(new MapStrip());
		internalContext.setStrips(strips);
		genome.getMainFunction().run(new RuntimeContext(internalContext, input, output));
		return output;
	}
}

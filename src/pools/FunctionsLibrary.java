package pools;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import individues.Function;

public class FunctionsLibrary {
	
	Set<Function> functions;
	
	Random random = new Random();
	
	static FunctionsLibrary functionsLibrary;
	
	private FunctionsLibrary() {}
	
	public static FunctionsLibrary getInstance() {
		if (functionsLibrary == null) functionsLibrary = new FunctionsLibrary();
		return functionsLibrary;
	}
	
	public void store(Function function) {
		functions.add(function);
	}
	
	public Function getRandomFunction() {
		int size = functions.size();
		int n = random.nextInt() % size;
		Iterator<Function> it = functions.iterator();
		for (int i = 0; i < n; ++i) {
			it.next();
		}
		return it.next();
	}
}

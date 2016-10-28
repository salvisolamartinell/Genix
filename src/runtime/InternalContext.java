package runtime;

import java.util.ArrayList;
import java.util.List;

public class InternalContext {
	private int currentInstruction;
	private List<Strip> strips = new ArrayList<>();
	
	public List<Strip> getStrips() {
		return strips;
	}
	
	public void setStrips(List<Strip> strips) {
		if (strips == null) throw new IllegalArgumentException();
		this.strips = strips;
	}

	public List<Strip> getStrips(List<Integer> stripNums) {
		List<Strip> selectedStrips = new ArrayList<>();
		for (int i : stripNums) {
			selectedStrips.add(getStrip(i));
		}
		return selectedStrips;
	}

	public Strip getStrip(int stripNum) {
		return strips.get(stripNum);
	}

	public int getCurrentInstruction() {
		return currentInstruction;
	}

	public void setCurrentInstruction(int currentInstruction) {
		this.currentInstruction = currentInstruction;
	}

}

package runtime;

import java.util.Map;

public class MapStrip implements Strip {
	private int position;
	private Map<Integer, Integer> positionValue;
	
	/* (non-Javadoc)
	 * @see runtime.Strip#moveRight()
	 */
	@Override
	public void moveRight() {
		++position;
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#moveLeft()
	 */
	@Override
	public void moveLeft() {
		--position;
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#moveToOrigin()
	 */
	@Override
	public void moveToOrigin() {
		position = 0;
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#increment()
	 */
	@Override
	public void increment() {
		if (positionValue.containsKey(position)) {
			positionValue.put(position, positionValue.get(position) + 1);
		} else {
			positionValue.put(position, 1);
		}
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#decrement()
	 */
	@Override
	public void decrement() {
		if (positionValue.containsKey(position)) {
			positionValue.put(position, positionValue.get(position) - 1);
		} else {
			positionValue.put(position, -1);
		}
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#assignZero()
	 */
	@Override
	public void assignZero() {
		positionValue.put(position, 0);
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#get()
	 */
	@Override
	public int getValue() {
		if (positionValue.containsKey(position)) {
			return positionValue.get(position);
		} else {
			return 0;
		}
	}
	
	/* (non-Javadoc)
	 * @see runtime.Strip#get()
	 */
	@Override
	public void setValue(int value) {
		positionValue.put(position, value);
	}
}

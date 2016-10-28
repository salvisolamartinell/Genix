package runtime;

public interface Strip {

	void moveRight();

	void moveLeft();

	void moveToOrigin();

	void increment();

	void decrement();

	void assignZero();

	int getValue();
	
	void setValue(int value);

}
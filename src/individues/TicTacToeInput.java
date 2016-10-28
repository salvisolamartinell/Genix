package individues;

public class TicTacToeInput implements Input {

	private int[][] board = new int[3][3];
	int row = 0;
	int col = 0;
	
	@Override
	public int numberOfAlters() {
		return 1;
	}

	@Override
	public void alter(int alterIndex) {
		if (col < 2) ++col;
		else {
			col = 0;
			if (row < 2) ++row;
			else row = 0;
		}
	}

	@Override
	public int numberOfGets() {
		return 1;
	}

	@Override
	public int get(int getIndex) {
		if (getIndex > 0) throw new IndexOutOfBoundsException();
		return board[row][col];
	}

}

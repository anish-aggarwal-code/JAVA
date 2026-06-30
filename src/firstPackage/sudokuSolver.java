package firstPackage;

public class sudokuSolver {
	static int GRID_SIZE = 9;

	public static void main(String[] args) {
		int[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		System.out.println("Sudoku solver");

		if (enterValues(board) == true) {
			System.out.println("Sudoku solved sucessfully");
			display(board);
		} else {
			System.out.println("Sudoku is unsolvable");
		}
	}

	public static void display(int[][] board) {
		for (int row = 0; row < GRID_SIZE; row++) {
			for (int col = 0; col < GRID_SIZE; col++) {
				System.out.print(board[row][col]+" | ");
			}
			System.out.println();
			System.out.println("-----------------------------------");
		}
		

	}

	public static boolean isPresentInRow(int[][] board, int number, int row, int col) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[row][i] == number) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPresentInColumn(int[][] board, int number, int row, int col) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (board[i][col] == number) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPresentInGrid(int[][] board, int number, int row, int col) {
		int gridFirstRow = row - row % 3;
		int gridFirstColumn = col - col % 3;
		for (int i = gridFirstRow; i < gridFirstRow + 3; i++) {
			for (int j = gridFirstColumn; j < gridFirstColumn + 3; j++) {
				if (board[i][j] == number) {
					return true;
				}

			}
		}
		return false;
	}

	public static boolean isValid(int[][] board, int number, int row, int col) {
		if (isPresentInRow(board, number, row, col) == false && isPresentInColumn(board, number, row, col) == false
				&& isPresentInGrid(board, number, row, col) == false) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean enterValues(int[][] board) {
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				if (board[i][j] == 0) {
					for (int x = 1; x <= 9; x++) {
						if (isValid(board, x, i, j) == true) {
							board[i][j] = x;
							
							if (enterValues(board) == true) {
								return true;
							} else {
								board[i][j] = 0;

							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

}

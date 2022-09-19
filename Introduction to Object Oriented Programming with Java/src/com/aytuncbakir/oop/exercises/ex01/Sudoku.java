package com.aytuncbakir.oop.exercises.ex01;


public class Sudoku {

	public static final int BOARD_SIZE = 9;
	private int[][] board = {   { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
							{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
							{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
							{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
							{ 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
							{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
							{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
							{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
							{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
						};

	public Sudoku(int[][] board) {
		super();
		this.board = board;
	}

	public void printBoard(int[][] board) {
		
		for (int i = 0; i < BOARD_SIZE; i++) {
			if(i % 3 == 0 && i != 0)
				System.out.println("------------------------------------");
			for (int j = 0; j < BOARD_SIZE; j++) {
				System.out.print(this.board[i][j]);
				if(j < BOARD_SIZE-1)
					System.out.print(" | ");
			}
			System.out.println();
			
		}
		
	}

	public boolean isNumberAvailableInRow(int[][] board, int row, int number) {

		for (int i = 0; i < BOARD_SIZE; i++) {
			if (board[row][i] == number)
				return true;
		}
		return false;
	}

	public boolean isNumberAvailableInColumn(int[][] board, int column, int number) {

		for (int i = 0; i < BOARD_SIZE; i++) {
			if (board[i][column] == number)
				return true;
		}
		return false;
	}

	public boolean isNumberAvailableInSquare(int[][] board, int row, int column, int number) {

		row = row - row % 3;
		column = column - column % 3;

		for (int i = row; i < row + 3; i++) {
			for (int j = column; j < column + 3; j++) {
				if (board[i][j] == number)
					return true;
			}
		}
		return false;
	}

	public  boolean isPlacementOk(int[][] board, int row, int column, int number) {

		return !isNumberAvailableInColumn(board, column, number) && !isNumberAvailableInRow(board, row, number)
				&& !isNumberAvailableInSquare(board, row, column, number);

	}

	public boolean solveSudoku(int[][] board) {

		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int column = 0; column < BOARD_SIZE; column++) {
				if (board[row][column] == 0) {
					for (int candidateNumber = 1; candidateNumber <= BOARD_SIZE; candidateNumber++) {
						if (isPlacementOk(board, row, column, candidateNumber)) {
							board[row][column] = candidateNumber;

							if (solveSudoku(board)) {
								return true;
							}else {
								board[row][column] = 0;
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

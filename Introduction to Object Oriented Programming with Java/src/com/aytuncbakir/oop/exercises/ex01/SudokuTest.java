package com.aytuncbakir.oop.exercises.ex01;

public class SudokuTest {
	
	public static void main(String[] args) {
		
	 int[][] board = {   	{ 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
			 				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
			 				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
			 				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
			 				{ 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
			 				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
			 				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
			 				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
			 				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
			};

		Sudoku sudoku = new Sudoku(board);
		
		sudoku.printBoard(board);
		if(sudoku.solveSudoku(board)) {
			System.out.println();
			System.out.println("Sudoku has been solved!");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("Sudoku was not solved!");
			System.out.println();
		}
		sudoku.printBoard(board);
	}
	

}

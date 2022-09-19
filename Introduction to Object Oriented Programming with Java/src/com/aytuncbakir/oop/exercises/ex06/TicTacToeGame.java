package com.aytuncbakir.oop.exercises.ex06;

import java.util.Arrays;

public class TicTacToeGame {
	
	public static char[][] board =  {	{' ',' ',' '},
										{' ',' ',' '},
										{' ',' ',' '}
									};
		
	
	public void runGame() {
		movements();
	}
	
	public void movements() {

//		play( 0, 0, 'X');play( 0, 1, 'O');play( 0, 2, 'X');
//		play( 1, 0, 'X');play( 1, 1, 'O');play( 1, 2, 'O');
//		play( 2, 0, 'O');play( 2, 1, 'X');play( 2, 2, 'X');
//		
		play( 0, 0, 'X');play( 0, 1, 'O');play( 0, 2, 'X');
		play( 1, 0, 'X');play( 1, 1, 'X');play( 1, 2, 'O');
		play( 2, 0, 'O');play( 2, 1, 'X');play( 2, 2, 'X');
	}
	
	public void play(int row, int column, char value) {
		
		board[row][column] = value;
		if(isGameFinished()) {
			System.out.println("Game over!");
			printBoard() ;
			System.exit(1);
		}else {
			System.out.println("Play:");
			printBoard() ;
		}
		
		if(isBoardFull()) {
			System.out.println("Game Over!");
			System.out.println("Game will start again!");
			for (int i = 0; i < board.length; i++) {
				Arrays.fill(board[i], ' ');
			}
			printBoard();
		}
		
	}
	
	public boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == ' ')
					return false;
			}	
		}
		return true;
	}
	
	public boolean isGameFinished() {
		return     checkRows()  		  
				|  checkColumns() 
				|  checkCrosslineRight( 2, 0) 
				|  checkCrosslineLeft( 0 , 0);
	}
	

	public boolean checkRows() {
		
		char[] values = new char[3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++ ) {
				values[j] = board[i][j];
			}
			if(checkEquality(values))
				return true;
			else {
				Arrays.fill(values, ' ');
				
			}
		}
		return false;  
	}
	
	public boolean checkColumns() {
		char[] values = new char[3];
	    int setJ = 0;
		for (int i = 0; i < board.length; ) {
			for (int j = setJ; i < board.length & setJ < board.length ; i++) {
				values[i] = board[i][j];
			}
			i = 0;
			if(setJ == 3) {
				i = 3;
				break;
			}else
				setJ++;
			
			if(checkEquality(values))
				return true;
			else
				Arrays.fill(values, ' ');
				
		}
		return false;
	}
	
	public boolean checkCrosslineLeft(int row, int col) {
		char[] values = {board[row][col], board[row + 1][col + 1],board[row + 2][col + 2] };
		return checkEquality(values);
	}
	
	public boolean checkCrosslineRight(int row, int col) {
		char[] values = {board[row][col], board[row - 1][col + 1],board[row - 2][col + 2] };
		return checkEquality(values);

	}
	
	public void printBoard() {
		System.out.println("Result:");
		for (int i = 0; i < board.length; i++) {
			System.out.print(" ");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+ " | ");
			}
			System.out.println("\n -----------");
		}
		
	}
	
	public boolean checkEquality(char[] values) {
		//printValues(values);
		if(isEmptyValuse(values))
			return false;
		if(values[0] == values[1] & values[1] == values[2])
			return true;
		return false;
	}
	
	public boolean isEmptyValuse(char[] values) {	
		if(values[0] == ' ' | values[1] == ' ' | values[2] == ' ')
			return true;
		return false;
	}
	
}

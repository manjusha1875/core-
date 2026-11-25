package com.Arrays.Sorting;

import java.util.Scanner;

public class TicTocToe {

	static char[][] board = new char[3][3];

	static char player = 'X';

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = ' ';
			}
		}

		System.out.println("Start Game!!!!!");

		while (true) {

			printBoard();

			System.out.println(player + "'s Turn!!!!");

			System.out.println("Please choose row (0-2)");
			int row = sc.nextInt();

			System.out.println("Please choose col (0-2)");
			int col = sc.nextInt();

			if (row < 0 || row > 2 || col < 0 || col > 2) {
				System.out.println("Invalid position! Try again.");
				continue;
			}

			if (board[row][col] != ' ') {
				System.out.println("Already occupied! Try again.");
				continue;
			}

			board[row][col] = player;

			if (checkWinner()) {

				printBoard();

				System.out.println(player + " is the Winner!!!!!");
				break;
			}

			if (checkDraw()) {

				printBoard();

				System.out.println("Game is Draw!!!!!");
				break;
			}

			if (player == 'X') {
				player = 'O';
			} else {
				player = 'X';
			}
		}

		sc.close();
	}

	private static void printBoard() {

		System.out.println("-------------");

		for (int i = 0; i < board.length; i++) {

			System.out.print("| ");

			for (int j = 0; j < board.length; j++) {

				System.out.print(board[i][j] + " | ");
			}

			System.out.println();

			System.out.println("-------------");
		}
	}

	private static boolean checkWinner() {

		// Check rows
		for (int i = 0; i < 3; i++) {

			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {

				return true;
			}
		}

		// Check columns
		for (int j = 0; j < 3; j++) {

			if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {

				return true;
			}
		}

		// Check diagonals
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {

			return true;
		}

		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {

			return true;
		}

		return false;
	}

	private static boolean checkDraw() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (board[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;
	}
}

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[][] board = {
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '}};
		
		System.out.print("Enter a play position (1-9): ");
		int position = input.nextInt();
		
		switch(position) {
			case 1 -> board[0][0] = 'X';
		}
		//board[0][0] = 'X';
		
		showBoard(board);
	}
	
	public static void showBoard(char[][] board) {
		for(char[] c: board) {
			for(char elem: c) {
				System.out.print(elem);
			}
			System.out.println();
		}
	}
	
	
	
}
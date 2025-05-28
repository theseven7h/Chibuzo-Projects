public class TicTacToe {
	public static void main(String[] args) {
		char[][] board = {
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '}};
		
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
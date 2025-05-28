import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTicTacToe {
	TicTacToe game = new TicTacToe();
	char[][] board = {
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '}};
	/*@BeforeEach
	public void setUp() {
		
	}*/
	
	@Test
	public void testShowBoardFunctionExists() {
		game.showBoard(board);
	}
}

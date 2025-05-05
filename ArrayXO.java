public class ArrayXO {
	public static void main(String[] args) {
		char[][] xo = new char[3][3];

		xo[0][0] = 'X'; xo[0][1] = 'O'; xo[0][2] = 'X'; 
		xo[1][0] = 'O'; xo[1][1] = 'O'; xo[1][2] = 'O'; 
		xo[2][0] = 'X'; xo[2][1] = 'X'; xo[2][2] = 'O'; 

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(xo[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
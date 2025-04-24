public class PatternC {
	public static void main(String[] args) {
		for(int row = 1; row <= 6; row++) {
			for(int spc = 6; spc >= row; spc--) {
				System.out.print(" ");
			}
			for(int num = row; num >= 1; num--) {
				System.out.print(" " + num );
			}
			System.out.println();
		}
	}
}
    
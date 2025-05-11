import java.util.Scanner;

public class TestDrillerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfCopies = 0;
		while (true) {
			try {
				System.out.print("Enter the number of copies: ");	
				noOfCopies = sc.nextInt();
				if (noOfCopies == 0) System.out.print("You haven't entered a right amount");
				else System.out.print(TestDriller.calculateCopiesPrice(noOfCopies) + "naira"); break;
			} catch (Exception e) {
				System.out.println("Error: Enter integer only\n");
				sc.nextLine();
			}
		}
	}
}
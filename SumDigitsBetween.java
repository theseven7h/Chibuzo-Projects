import java.util.Scanner;

public class SumDigitsBetween {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number(1 - 999): ");
		int number = input.nextInt();
		
		while (number < 1 || number > 999) {
			System.out.print("Enter a number(1 - 999): ");
			number = input.nextInt();
		}
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		System.out.print("Sum of the digit(s) is " + sum);
	}
}
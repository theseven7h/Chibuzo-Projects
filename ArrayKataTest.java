import java.util.Scanner;

public class ArrayKataTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of inputs: ");
		int number = sc.nextInt();

		int[] numbers = new int[number];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		//System.out.print(ArrayKata.maximumIn(numbers));
		//System.out.print(ArrayKata.minimumIn(numbers));
		//System.out.print(ArrayKata.sumOf(numbers));
		//System.out.print(ArrayKata.sumOfOddNumbers(numbers));		
		System.out.print(ArrayKata.sumOfEvenNumbers(numbers));
	}
}
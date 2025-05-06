import java.util.Scanner;
import java.util.Arrays;

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
		//System.out.print(ArrayKata.sumOfEvenNumbers(numbers));			
		//System.out.print(ArrayKata.sumOfOddNumbers(numbers));					
		//System.out.print(Arrays.toString(ArrayKata.maximumAndMinimumOf(numbers)));
		//System.out.print(ArrayKata.noOfOddNumbersIn(numbers));
		//System.out.print(ArrayKata.noOfEvenNumbersIn(numbers));
		//System.out.print(Arrays.toString(ArrayKata.evenNumbersIn(numbers)));
		System.out.print(Arrays.toString(ArrayKata.oddNumbersIn(numbers)));
		//System.out.print(Arrays.toString(ArrayKata.squareNumbersIn(numbers)));

		/*int[] a = {2, 4, 5, 6, 7};
		int[] myEven = ArrayKata.evenNumbersIn(numbers);

		for (int each : myEven) {
			System.out.println(each);
		}*/

		


	}
}
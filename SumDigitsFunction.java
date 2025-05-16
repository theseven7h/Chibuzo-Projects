public class SumDigitsFunction {
	public static int sumDigitsBetween(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}
}

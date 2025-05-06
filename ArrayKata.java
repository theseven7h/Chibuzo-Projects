public class ArrayKata {
	static int maximumIn(int[] numbers) {
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) max = numbers[i];
		}
		return max;
	}




}
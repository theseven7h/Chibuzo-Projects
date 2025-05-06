public class ArrayKata {
	static int maximumIn(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) max = numbers[i];
		}
		return max;
	}

	static int minimumIn(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) min = numbers[i];
		}
		return min;
	}





}
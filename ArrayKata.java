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

	static int sumOf(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}	

	static int sumOfEvenNumbers(int[] numbers) {
		int sumOfEven = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) sumOfEven += numbers[i];	
		}
		return sumOfEven;
	}

	static int sumOfOddNumbers(int[] numbers) {
		int sumOfOdd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) sumOfOdd += numbers[i];	
		}
		return sumOfOdd;
	}

	static int[] maximumAndMinimumOf(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) max = numbers[i];
			if (numbers[i] < min) min = numbers[i];
		}
		return new int[] {max, min};	
	}	

	static int noOfOddNumbersIn(int[] numbers) {
		int noOfOdd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0 && numbers[i] != 1) noOfOdd++;	
		}
		return noOfOdd;
	}

	static int noOfEvenNumbersIn(int[] numbers) {
		int noOfEven = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) noOfEven++;	
		}
		return noOfEven;
	}

	static int[] evenNumbersIn(int[] numbers) {
		noOfEvenNumbersIn(numbers);
		int[] evenNumbers = new int[noOfEvenNumbersIn(numbers)];
		int count = 0;
		for (int j : numbers) {
			if (j % 2 == 0) evenNumbers[count++] = j;
		}
		return evenNumbers;
	}
}
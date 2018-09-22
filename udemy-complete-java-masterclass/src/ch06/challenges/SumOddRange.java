package ch06.challenges;

public class SumOddRange {

	public static final int MIN_NUMBER = 0;

	public static void main() {
		System.out.println("SumOddRange");
		int start_value = 1, end_value = 100;
		System.out.println("Sum of odd number between " + start_value + " and " + end_value + " is : "
				+ SumOddRange.sumOdd(start_value, end_value));
		start_value = -1;
		System.out.println("Sum of odd number between " + start_value + " and " + end_value + " is : "
				+ SumOddRange.sumOdd(start_value, end_value));
		start_value = 100;
		System.out.println("Sum of odd number between " + start_value + " and " + end_value + " is : "
				+ SumOddRange.sumOdd(start_value, end_value));
		end_value = -100;
		System.out.println("Sum of odd number between " + start_value + " and " + end_value + " is : "
				+ SumOddRange.sumOdd(start_value, end_value));
		end_value = 1000;
		System.out.println("Sum of odd number between " + start_value + " and " + end_value + " is : "
				+ SumOddRange.sumOdd(start_value, end_value));
		System.out.println();
	}

	public static boolean isOdd(int number) {
		if (number < 1 || number % 2 == 0)
			return false;
//		System.out.println(number + " is an odd number.");
		return true;
	}

	public static int sumOdd(int start, int end) {
		if (start > end || start < MIN_NUMBER || end < MIN_NUMBER)
			return -1;

		int total = 0;
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				total += i;
			}
		}
		return total;
	}

}

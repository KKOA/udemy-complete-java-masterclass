package ch06.challenges;

public class DigitSum {

	private static final int MIN = 10;

	public static void main() {

		int number = 1;
		// System.out.println("The sum of digits in number " + number + " is " +
		// DigitSum.sumDigits(number));
		DigitSum.isValid(number);
		number = 10;
		// System.out.println("The sum of digits in number " + number + " is " +
		// DigitSum.sumDigits(number));
		DigitSum.isValid(number);

		number = 5;
		// System.out.println("The sum of digits in number " + number + " is " +
		// DigitSum.sumDigits(number));
		DigitSum.isValid(number);

		number = 125;
		// System.out.println("The sum of digits in number " + number + " is " +
		// DigitSum.sumDigits(number));
		DigitSum.isValid(number);

		number = 9;
		// System.out.println("The sum of digits in number " + number + " is " +
		// DigitSum.sumDigits(number));
		DigitSum.isValid(number);

		number = 4298;
		// System.out.println("The sum of digits in number " + number + " is " +
		// DigitSum.sumDigits(number));
		DigitSum.isValid(number);
		System.out.println();
	}

	public static void isValid(int number) {
		if (sumDigits(number) == -1) {
			System.out.println(number + " is does not contain the correct number of digits");
		} else {
			System.out.println("The sum of digits in number " + number + " is " + DigitSum.sumDigits(number) + ".");
		}
	}

	public static int sumDigits(int number) {

		int sum = 0;
		if (number < MIN)
			return -1;
		while (number > 0) {
			int digit = number % 10; // extract least significant digit
			sum += digit; // Add to total
			number /= 10; // Remove least significant digit , decimal values are drop in integer division
							// calculation
		}

		return sum;
	}
}

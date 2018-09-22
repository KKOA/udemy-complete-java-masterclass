package ch06.challenges;

public class FirstLastDigitSum {

	public static void main() {
		System.out.println("FirstLastDigitSum");
		int number = 0;
		System.out.println(
				"Sum of First and last digit of " + number + " : " + FirstLastDigitSum.sumFirstAndLastDigit(number));
		number = -10;
		System.out.println(
				"Sum of First and last digit of " + number + " : " + FirstLastDigitSum.sumFirstAndLastDigit(number));
		number = 345;
		System.out.println(
				"Sum of First and last digit of " + number + " : " + FirstLastDigitSum.sumFirstAndLastDigit(number));

		System.out.println(
				"Sum of First and last digit of " + number + " : " + FirstLastDigitSum.sumFirstAndLastDigit2(number));
		System.out.println();

	}

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		} else {
			String text = String.valueOf(number);
			// int firstDigit = Integer.parseInt(String.valueOf(text.charAt(0)));
			int firstDigit = charToInt(text.charAt(0));

			// int lastDigit = Integer.parseInt(String.valueOf(text.charAt(text.length() -
			// 1)));
			int lastDigit = charToInt(text.charAt(text.length() - 1));
			// text.charAt(text.length() - 1);
			return firstDigit + lastDigit;
		}
	}

	public static int charToInt(char digit) {
		String number = String.valueOf(digit);
		return Integer.parseInt(number);
	}

	// Alternative solution by Piotr
	public static int sumFirstAndLastDigit2(int number) {
		if (number < 0) {
			return -1;
		} else if (number < 10) {
			return number;
		} else {
			int lastDigit = number % 10;
			int firstDigit = 0;
			while (number >= 10) {
				number /= 10;
				firstDigit = number;
			}

			return firstDigit + lastDigit;
		}
	}

}

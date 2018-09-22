package ch05.challenges;

public class IntEqualityPrinter {

	private static final String VALUE_SAME = "All numbers are equal";
	private static final String VALUE_DIFFERENT = "All numbers are different";
	private static final String DEFAULT = "Neither all are equal or different";
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

	public static void main() {
		System.out.println("IntEqualityPrinter");
		IntEqualityPrinter.printEqual(1, 1, 1);
		IntEqualityPrinter.printEqual(1, 1, 2);
		IntEqualityPrinter.printEqual(-1, -1, -1);
		IntEqualityPrinter.printEqual(1, 2, 3);
		System.out.println();
	}

	public static void printEqual(int number1, int number2, int number3) {
		if (number1 < 0 || number2 < 0 || number3 < 0) {
			System.out.println(INVALID_VALUE_MESSAGE);
		} else if ((number1 == number2) && (number2 == number3)) {
			System.out.println(VALUE_SAME);
		} else if ((number1 != number2) && (number1 != number3) && (number2 != number3)) {
			System.out.println(VALUE_DIFFERENT);
		} else {
			System.out.println(DEFAULT);
		}
	}
}

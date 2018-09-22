package ch06.challenges;

public class NumberInWord {

	private static final String INVALID_VALUE_MESSAGE = "OTHER";
	private static final String[] NUMBER = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE" };

	public static void main() {
		System.out.println("NumberInWord");
		NumberInWord.printNumberInWord(0);
		NumberInWord.printNumberInWord(-4);
		NumberInWord.printNumberInWord(5);
		NumberInWord.printNumberInWord(10);
		NumberInWord.printNumberInWord(9);
		System.out.println();
	}

	public static void printNumberInWord(int number) {
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println(NUMBER[number]);
			break;
		default:
			System.out.println(INVALID_VALUE_MESSAGE);
		}

	}
}

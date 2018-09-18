package ch06.challenges;

public class AllFactors {
	public static final int MIN = 1;
	public static final String INVALID_MSG = "Invalid Value";

	public static void main() {
		printFactors(6);
		printFactors(-1);
		printFactors(32);
		printFactors(0);
		printFactors(1);
		System.out.println();
	}

	public static void printFactors(int number) {
		if (number < MIN) {
			System.out.println(number + " is " + INVALID_MSG);
			return;
		}

		System.out.print("Factors of " + number + " are : ");
		for (int i = MIN; i <= number; i++) {
			if (divisibleBy(number, i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static boolean divisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}

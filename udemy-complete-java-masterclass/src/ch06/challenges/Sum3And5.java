package ch06.challenges;

public class Sum3And5 {

	public static final int FOUND_LIMIT = 5;
	public static final int START_COUNTER = 1;
	public static final int END_COUNTER = 1000;

	public static void main() {
		System.out.println("Sum3And5");
		int total = 0, found = 0;
		for (int i = START_COUNTER; i < END_COUNTER; i++) {
			if (divisibleBy(15, i)) {
				total += i;
				System.out.println(i + " is divisible by 5 and 3");
				found++;
			}
			if (found == FOUND_LIMIT)
				break;
		}
		System.out.println("Sum of numbers divisible by 5 and 3  between " + START_COUNTER + " and " + END_COUNTER
				+ " is " + total);
		System.out.println();
	}

	public static boolean divisibleBy(int divisor, int number) {
		return number % divisor == 0;
	}

}

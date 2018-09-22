package ch06.challenges;

public class PerfectNumber {

	public static final int MIN = 1;

	public static void main() {
		System.out.println("PerfectNumber");
		int number = -56;
		System.out.println(number + " is a perfect number : " + isPerfectNumber(number));
		number = 6;
		System.out.println(number + " is a perfect number : " + isPerfectNumber(number));
		number = 0;
		System.out.println(number + " is a perfect number : " + isPerfectNumber(number));
		number = 28;
		System.out.println(number + " is a perfect number : " + isPerfectNumber(number));
		number = 5;
		System.out.println(number + " is a perfect number : " + isPerfectNumber(number));
		System.out.println();
	}

	public static boolean isPerfectNumber(int number) {
		int total = 0;
		if (number < MIN)
			return false;

		for (int i = MIN; i < number; i++) {
			if (divisibleBy(number, i))
				total += i;
		}
		return total == number;
	}

	public static boolean divisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}

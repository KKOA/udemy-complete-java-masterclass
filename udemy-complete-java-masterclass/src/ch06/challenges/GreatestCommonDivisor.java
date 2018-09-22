package ch06.challenges;

public class GreatestCommonDivisor {

	public static final int MIN = 10;

	public static void main() {

		System.out.println("GreatestCommonDivisor");
		int num1 = 75, num2 = 25;
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is : "
				+ getGreatestCommonDivisor(num1, num2));

		num1 = 12;
		num2 = 3;
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is : "
				+ getGreatestCommonDivisor(num1, num2));

		num1 = 12;
		num2 = 30;
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is : "
				+ getGreatestCommonDivisor(num1, num2));

		num1 = 6;
		num2 = 30;
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is : "
				+ getGreatestCommonDivisor(num1, num2));

		num1 = 18;
		num2 = 36;
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is : "
				+ getGreatestCommonDivisor(num1, num2));
		System.out.println();

	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if (lessThanMin(first) || lessThanMin(second)) {
			System.out.println("One or both number is less than 10");
			return -1;
		}

		int commonDivsor = 0;

		for (int i = 1; i <= first; i++) {
			if (divisibleBy(first, i)) {
				if (divisibleBy(second, i)) {
					commonDivsor = i;
				}
			}
		}

		return commonDivsor;
	}

	public static boolean divisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

	public static boolean lessThanMin(int number) {
		return number < MIN;
	}

}

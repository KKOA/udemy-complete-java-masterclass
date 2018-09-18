package ch06.challenges;

public class LastDigitChecker {

	public static void main() {
		// TODO Auto-generated method stub
		int num1 = 41, num2 = 22, num3 = 71;
		System.out.println(hasSameLastDigit(num1, num2, num3));

		num1 = 90;
		num2 = 98;
		num3 = 96;
		System.out.println(hasSameLastDigit(num1, num2, num3));

		num1 = 23;
		num2 = 32;
		num3 = 42;
		System.out.println(hasSameLastDigit(num1, num2, num3));

		num1 = 9;
		num2 = 99;
		num3 = 999;
		System.out.println(hasSameLastDigit(num1, num2, num3));
		System.out.println();
	}

	public static final int MIN = 10;
	public static final int MAX = 1000;

	public static boolean hasSameLastDigit(int number1, int number2, int number3) {

		if (notInRange(number1) || notInRange(number2) || notInRange(number3))
			return false;

		int lastDigit1 = getLastDigit(number1);
		int lastDigit2 = getLastDigit(number2);
		int lastDigit3 = getLastDigit(number3);

		if (isEqual(lastDigit1, lastDigit2) || isEqual(lastDigit1, lastDigit3) || isEqual(lastDigit2, lastDigit3))
			return true;

		return false;
	}

	public static boolean notInRange(int number) {
		return number < MIN || number > MAX;
	}

	public static int getLastDigit(int number) {
		return number % 10;
	}

	public static boolean isEqual(int number1, int number2) {
		return number1 == number2;
	}

}

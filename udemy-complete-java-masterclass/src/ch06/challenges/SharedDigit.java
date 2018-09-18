package ch06.challenges;

public class SharedDigit {

	public static final int MIN_DOUBLE_DIGIT = 10;
	public static final int MAX_DOUBLE_DIGIT = 99;

	public static void main() {
		// TODO Auto-generated method stub
		int num1 = 9, num2 = 9;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 12;
		num2 = 23;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 8;
		num2 = 88;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 15;
		num2 = 43;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 77;
		num2 = 7;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 10;
		num2 = 1000;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 970;
		num2 = 70;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		num1 = 222;
		num2 = 2322;
		System.out.println(num1 + " and " + num2 + " share a common digit : " + hasSharedDigit(num1, num2));
		System.out.println();
	}

	public static boolean hasSharedDigit(int number1, int number2) {
		// if ((number1 <= 9 || number1 >= 100) || (number2 <= 9 || number2 >= 100))
		// return false;
		if (!isDoubleDigit(number1) || !isDoubleDigit(number2)) {
			System.out.println("One or both of the numbers outside valid range of 10 - 99");
			return false;
		}
		while (number1 != 0) {
			int lastDigit1 = number1 % 10;
			while (number2 != 0) {
				int lastDigit2 = number2 % 10;
				if (lastDigit1 == lastDigit2)
					return true;
				number2 /= 10;
			}
			number1 /= 10;
		}

		return false;
	}

	public static boolean isDoubleDigit(int number) {
		return number >= MIN_DOUBLE_DIGIT && number <= MAX_DOUBLE_DIGIT;
	}

}

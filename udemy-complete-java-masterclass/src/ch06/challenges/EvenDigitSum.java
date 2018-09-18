package ch06.challenges;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(-22));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(357));
	}

	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}

		int total = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			if (isEven(lastDigit)) {
				total += lastDigit;
			}
			number /= 10;
		}
		return total;
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

}

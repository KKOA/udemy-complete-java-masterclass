package ch06.challenges;

public class NumberToWords {

	public static final int MIN = 0;
	public static final String INVALID_MSG = "Invalid Value";

	public static void main() {
		System.out.println("NumberToWords");
		numberToWords(10);
		numberToWords(0);
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		numberToWords(-12);
		System.out.println();

	}

	public static void numberToWords(int number) {
		if (number < MIN) {
			System.out.println(number + " is " + INVALID_MSG);
			return;
		} else if (number == MIN) {
			System.out.println(number + " is Zero");
			return;
		} else {
			int lastDigit = 0;
			int numDigitCount = getDigitCount(number);
			int revNumber = reverse(number);
			int revDigitCount = getDigitCount(revNumber);
			int differnce = numDigitCount - revDigitCount;

			System.out.print(number + " is ");
			while (revNumber != 0) {
				lastDigit = revNumber % 10;
				revNumber /= 10;
				switch (lastDigit) {
				case 0:
					System.out.print("Zero");
					break;
				case 1:
					System.out.print("One");
					break;
				case 2:
					System.out.print("Two");
					break;
				case 3:
					System.out.print("Three");
					break;
				case 4:
					System.out.print("Four");
					break;
				case 5:
					System.out.print("Five");
					break;
				case 6:
					System.out.print("Six");
					break;
				case 7:
					System.out.print("Seven");
					break;
				case 8:
					System.out.print("Eight");
					break;
				case 9:
					System.out.print("Nine");
					break;
				}
			}

			for (int i = 0; i < differnce; i++) {
				System.out.print("Zero");
			}
			System.out.println();
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse *= 10;
			reverse += number % 10;
			number /= 10;
		}
		return reverse;
	}

	public static int getDigitCount(int number) {

		int count = 0;

		if (number < MIN)
			return -1;
		if (number == MIN)
			return 1;

		while (number > MIN) {
			number /= 10;
			count++;
		}
		return count;
	}

}

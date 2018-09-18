package ch06.challenges;

public class LargestPrime {

	public static final int SMALLEST_PRIME = 2;

	public static void main() {
		int number = 21;
		System.out.println("Larget Prime less than equal to " + number + " : " + getLargestPrime(number));

		number = 0;
		System.out.println("Larget Prime less than equal to " + number + " : " + getLargestPrime(number));

		number = 217;
		System.out.println("Larget Prime less than equal to " + number + " : " + getLargestPrime(number));

		number = -66;
		System.out.println("Larget Prime less than equal to " + number + " : " + getLargestPrime(number));

		number = 45;
		System.out.println("Larget Prime less than equal to " + number + " : " + getLargestPrime(number));
		System.out.println();
	}

	public static int getLargestPrime(int number) {
		if (number < SMALLEST_PRIME)
			return -1;

		int currentNumber = number;

		for (; currentNumber > 1; currentNumber--) {
			if (!divisableBy(number, currentNumber))
				continue;
			if (isPrime(currentNumber)) {
				return currentNumber;
			}
		}
		return currentNumber;
	}

	public static boolean isPrime(int number) {
		boolean prime = true;
		for (int divisor = SMALLEST_PRIME; divisor <= number / SMALLEST_PRIME; divisor++) {
			if (divisableBy(number, divisor)) {
				prime = false;
				break; // num is not a prime, no reason to continue checking
			}
		}

		return prime;
	}

	public static boolean divisableBy(int number, int divisor) {
		return number % divisor == 0;
	}
}

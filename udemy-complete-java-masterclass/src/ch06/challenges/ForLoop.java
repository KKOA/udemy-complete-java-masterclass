package ch06.challenges;

public class ForLoop {

	public static void main() {
		double amount = 10_000;
		double interestRate;

		for (int i = 2; i <= 8; i++) {
			interestRate = (double) i;
			System.out.print(amount + " at " + interestRate + "% calculateInterest = ");
			System.out.println(String.format("%.2f", calculateInterest(amount, interestRate)));
			// String.format the output in this return value to 2 decimal places

		}
		System.out.println();

		// reverse
		for (int i = 8; i >= 2; i--) {
			interestRate = (double) i;
			System.out.print(amount + " at " + interestRate + "% calculateInterest = ");
			System.out.println(String.format("%.2f", calculateInterest(amount, interestRate)));
			// Output a number to two decimal points inside a string
		}

		System.out.println();
		int primeCounter = 0;
		for (int i = 20; i >= 2; i--) {
			if (isPrime(i)) {
				System.out.println(i + " is amount prime number.");
				primeCounter++;
			}
			if (primeCounter == 3) {
				System.out.println("Exiting");
				break;
			}
		}

	}

	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			// for (int i = 2; i <= Math.sqrt(n); i++) {
			// More efficient because fewer iteration
			if (n % i == 0)
				return false;
		}
		return true;
	}

}

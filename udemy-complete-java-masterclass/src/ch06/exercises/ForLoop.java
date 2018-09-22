package ch06.exercises;

public class ForLoop {

	public static void main() {

		System.out.println("For Loop");
		double amount = 10_000;
		double interestRate = 2;
		System.out.print(amount + " at " + interestRate + "% calculateInterest =");
		System.out.println(calculateInterest(amount, interestRate));

		for (int i = 0; i < 5; i++)
		// initiate termination-condition change-counter)
		// change-counter occurs at the end of iteration
		{
			System.out.println("Loop " + i + " hello!");
		}
		System.out.println();
	}

	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}

}

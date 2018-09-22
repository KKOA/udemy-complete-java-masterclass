package ch06.challenges;

import java.util.Scanner;

public class MinAndMaxInput {

	public static final String INVALID_INPUT_MSG = "Invalid Number";
	public static final String MSG = "Enter a number or non integer to exit";

	// private static final minInput "Mininmum = null;
	public static void main(Scanner scanner) {

		System.out.println("MinAndMaxInput");
		// Scanner scanner = new Scanner(System.in);

		Integer minInput = null;
		Integer maxInput = null;

		while (true) {

			System.out.println(MSG);
			if (scanner.hasNextInt()) {
				int currentNumber = scanner.nextInt();

				if ((minInput == null) || (currentNumber < minInput))
					minInput = currentNumber;

				if ((maxInput == null) || (currentNumber > maxInput))
					maxInput = currentNumber;

			} else {
				break;
			}
			scanner.nextLine();
		}
		// scanner.close();
		System.out.print("Mininmum Input : " + minInput + " ");
		System.out.println("Maxinmum Input : " + maxInput);
		System.out.println();

	}
}

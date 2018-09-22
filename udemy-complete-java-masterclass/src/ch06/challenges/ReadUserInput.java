package ch06.challenges;

import java.util.Scanner;

public class ReadUserInput {
	public static final int MAX_NUMBER_OF_INPUT = 10;
	public static final String INVALID_INPUT_MSG = "Invalid Number";

	public static void main(Scanner scanner) {
		System.out.println("ReadUserInput");
		int numberOfInput = 0;
		int total = 0;

//		Scanner scanner = new Scanner(System.in);
		while (numberOfInput < MAX_NUMBER_OF_INPUT) {

			int order = numberOfInput + 1;
			System.out.println("Enter number #" + order + " : ");
			if (scanner.hasNextInt()) {
				total += scanner.nextInt();
				numberOfInput++;
			} else {
				System.out.println(INVALID_INPUT_MSG);
			}
			scanner.nextLine();
			System.out.println();
		}
//		scanner.close();
		System.out.println("Total : " + total);
		System.out.println();

	}
}

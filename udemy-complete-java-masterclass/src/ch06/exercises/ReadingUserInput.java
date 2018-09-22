package ch06.exercises;

import java.util.Calendar;
import java.util.Scanner;

public class ReadingUserInput {

	public static final String INVALID_YEAR_MSG = "Invalid year of brith";

	public static void main(Scanner scanner) {

		System.out.println("ReadingUserInput");

//		Scanner scanner = new Scanner(System.in);
		// Read input from keyboard
		System.out.println("Enter your year of birth");
		boolean hasNextInt = scanner.hasNextInt(); // check if next entered input is a number without removing it from
													// the
													// scanner
		if (hasNextInt) {
			int year = scanner.nextInt(); // scanner method convert input in integer
			// Throw an error if value cannot converted to integer

			scanner.nextLine(); // Handle next line character (enter key) without this nextLine assume enter was
								// the value
			System.out.println("Enter your name");

			// Read line of input from the user
			String name = scanner.nextLine();

			System.out.println("Your name is :" + name + ".");
			System.out.println();

			int age = Calendar.getInstance().get(Calendar.YEAR) - year;

			// Calendar.getInstance().get(Calendar.YEAR); returns current year
			if (age >= 0 && age <= 100)
				System.out.println("Your are :" + age + " years old.");
			else
				System.out.println(INVALID_YEAR_MSG);
		} else {
			System.out.println(INVALID_YEAR_MSG);
		}

		System.out.println();

		// scanner.close(); // Free up memory used by scanner
		// Calling method such as nextLine or next will throw an error

	}

}

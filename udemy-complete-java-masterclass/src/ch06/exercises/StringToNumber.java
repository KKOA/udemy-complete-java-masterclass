package ch06.exercises;

public class StringToNumber {
	public static void main() {
		String numberAsString = "2018";
		System.out.println("numberAsString = " + numberAsString);
		int number = Integer.parseInt(numberAsString);
		// Convert to integer using Integer class class method parseInt
		System.out.println("number = " + number);

		numberAsString += 1;
		// Java automatically convert the number to string and then add it. 2018 + 1 =
		// 20181
		System.out.println("numberAsString = " + numberAsString);
		number += 1; // Perform math calculation 2018 + 1 = 2019
		System.out.println("number = " + number);

		// numberAsString = "2018a";
		// number = Integer.parseInt(numberAsString); // Throw error if cannot convert
		// to type. Java cannot convert string contain non numeric character to integer.

		numberAsString = "2018.125";
		double number2 = Double.parseDouble(numberAsString); // Throw error if cannot convert to type. Java cannot
																// convert string contain non numeric character to
																// integer.
		System.out.println(number2);
	}
}

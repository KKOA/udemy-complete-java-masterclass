package ch04.exercises;

public class StringType {
	public static void main() {
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);

		myString = myString + ", and this is more";
		System.out.println("myString is equal to " + myString);

		myString = myString + " \u00A9 2015";
		System.out.println("myString is equal to " + myString);

		String numberString = "250.55";
		System.out.println("numberString is equal to " + numberString);

		numberString = numberString + "49.95";
		System.out.println("Result is " + numberString);
		// When two string containing number are added the resulting string contain all
		// the characters in both
		// No arithmetic calculation is performed.

		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		// Java looks at context and implicit converts the integer to String
		System.out.println("lastString is equal to " + lastString);

		double mydouble = 120.47;
		lastString = lastString + mydouble;
		System.out.println("lastString is equal to " + lastString);

	}
}

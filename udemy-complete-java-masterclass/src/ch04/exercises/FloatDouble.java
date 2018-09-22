package ch04.exercises;

public class FloatDouble {

	public static void main() {

		System.out.println("FloatDouble");
		int myIntValue = 5;
		int myNewIntValue = myIntValue / 2;

		float myFloatValue = (float) 5;
		// Java by default use double for floating point numbers

		double myDoubleValue = 5d;
		// d at the end number is optional when using float numbers as it already cast
		// to double

		System.out.println("My Float value = " + myIntValue);
		System.out.println("My Float value = " + myFloatValue);
		System.out.println("My double value = " + myDoubleValue);
		System.out.println("Integer division = " + myIntValue + " / " + 2 + " = " + myNewIntValue);
		// Decimal number dropped 5/2 = 2;
		System.out.println("Double division = " + myFloatValue + " / " + 2f + " = " + (myFloatValue / 2f));
		// Add f end of the number tell java that this a float not a double

		// Double over float
		// more precise
		// faster and default return type for many of java built in functions
		System.out.println();
	}

}

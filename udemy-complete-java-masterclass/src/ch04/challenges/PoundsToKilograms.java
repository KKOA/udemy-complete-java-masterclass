package ch04.challenges;

public class PoundsToKilograms{

	public static void main() {
		// Convert pounds to kilograms
		double pounds = 200d;
		double kilograms = pounds * 0.45_359_237;
		// Can separate decimal number using underscore every 3 characters to increase
		// visibility
		System.out.println(pounds + "lbs = " + kilograms + " kg");

	}

}

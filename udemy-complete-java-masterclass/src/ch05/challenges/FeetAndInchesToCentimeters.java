package ch05.challenges;

public class FeetAndInchesToCentimeters {
	public static final int MIN = 0;
	public static final int INCHES_IN_FEET = 12;
	public static final double CMS_IN_INCH = 2.54d;

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet < MIN) || (inches < MIN || inches > INCHES_IN_FEET)) {
			System.out.println("Invalid inches or feet (" + feet + " feet, " + inches + " inches)");
			return -1;
		}

		double centimeters = ((feet * INCHES_IN_FEET) + inches) * CMS_IN_INCH;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm.");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < MIN) {
			System.out.println("Invalid inches (" + inches + " inches)");
			return -1;
		}
		double feet = (int) inches / INCHES_IN_FEET;
		inches = (double) ((int) inches % INCHES_IN_FEET);
		return calcFeetAndInchesToCentimeters(feet, inches);
		// Call another version of same method

	}
}

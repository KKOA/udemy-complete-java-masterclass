package ch05.challenges;

public class MinutesToYearsDaysCalculator {
	private static final int DAYS_IN_YEAR = 365;
	private static final int HOURS_IN_DAY = 24;
	private static final int MINUTES_IN_HOUR = 60;
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

	public static void main() {
		System.out.println("MinutesToYearsDaysCalculator");
		MinutesToYearsDaysCalculator.printYearsAndDays(525600);
		MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
		MinutesToYearsDaysCalculator.printYearsAndDays(561600);
		System.out.println();
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println(INVALID_VALUE_MESSAGE);
		} else {
			double hours = (minutes / MINUTES_IN_HOUR);
			double days = hours / HOURS_IN_DAY;
			double years = days / DAYS_IN_YEAR;
			days %= DAYS_IN_YEAR;

			System.out.println(minutes + " min = " + (int) years + " y and " + (int) days + " d");
		}
	}
}

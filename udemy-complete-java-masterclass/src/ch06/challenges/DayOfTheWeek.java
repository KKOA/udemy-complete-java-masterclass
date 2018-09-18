package ch06.challenges;

public class DayOfTheWeek {

	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	private static final String[] DAYS_OF_WEEK = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday", };

	public static void main() {
		int number = 4;
		DayOfTheWeek.printDayOfTheWeek(number);
		number = 7;
		DayOfTheWeek.printDayOfTheWeek(number);
		number = 0;
		DayOfTheWeek.printDayOfTheWeek(number);
		number = -6;
		DayOfTheWeek.printDayOfTheWeek(number);
		number = 6;
		DayOfTheWeek.printDayOfTheWeek(number);

		System.out.println();
	}

	public static void printDayOfTheWeek(int number) {
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println(DAYS_OF_WEEK[number]);
			break;
		default:
			System.out.println(INVALID_VALUE_MESSAGE);
			break;
		}

		// If else solutions
		// if (number < 7 && number > -1) {
		// System.out.println(DAYS_OF_WEEK[number]);
		// } else {
		// System.out.println(INVALID_VALUE_MESSAGE);
		// }
	}

}

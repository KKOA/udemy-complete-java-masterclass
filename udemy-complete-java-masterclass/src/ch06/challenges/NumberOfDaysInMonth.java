package ch06.challenges;

public class NumberOfDaysInMonth {

	private static final int MONTHS_IN_YEAR = 12;

	public static void main() {
		int year = -4;
		System.out.println(year + " is a leap year : " + NumberOfDaysInMonth.isLeapYear(year));
		year = 1600;
		System.out.println(year + " is a leap year : " + NumberOfDaysInMonth.isLeapYear(year));
		year = 2100;
		System.out.println(year + " is a leap year : " + NumberOfDaysInMonth.isLeapYear(year));
		year = 2020;
		System.out.println(year + " is a leap year : " + NumberOfDaysInMonth.isLeapYear(year));
		year = 99999;
		System.out.println(year + " is a leap year : " + NumberOfDaysInMonth.isLeapYear(year));

		int month = 1;
		year = 2020;
		System.out.println(
				month + " month " + year + " year has " + NumberOfDaysInMonth.getDaysInMonth(month, year) + " days");
		month = 2;
		System.out.println(
				month + " month " + year + " year has " + NumberOfDaysInMonth.getDaysInMonth(month, year) + " days");
		year = 2018;
		System.out.println(
				month + " month " + year + " year has " + NumberOfDaysInMonth.getDaysInMonth(month, year) + " days");
		month = -1;
		year = 2020;
		System.out.println(
				month + " month " + year + " year has " + NumberOfDaysInMonth.getDaysInMonth(month, year) + " days");
		month = 1;
		year = -2020;
		System.out.println(
				month + " month " + year + " year has " + NumberOfDaysInMonth.getDaysInMonth(month, year) + " days");

		System.out.println();
	}

	public static boolean isLeapYear(int year) {
		if ((year < 4) || (year > 9996))
			return false;

		if ((year % 100 == 0) && (year % 400 != 0))
			return false;

		if (year % 4 == 0)
			return true;

		return false;
	}

	public static int getDaysInMonth(int month, int year) {
		if ((month < 0) || (month > MONTHS_IN_YEAR))
			return -1;
		if ((year < 0) || (year > 9999))
			return -1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;

		case 2:
			if (isLeapYear(year)) {
				return 29;
			}
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;

		}
		return -1;
	}
}

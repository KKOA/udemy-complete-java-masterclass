package ch05.challenges;

public class LeapYear {
	public static boolean isLeapYear(int year) {
		if ((year < 4) || (year > 9996))
			return false;

		if ((year % 100 == 0) && (year % 400 != 0))
			return false;

		if (year % 4 == 0)
			return true;

		return false;
	}

}

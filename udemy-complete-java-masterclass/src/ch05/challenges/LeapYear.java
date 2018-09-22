package ch05.challenges;

public class LeapYear {

	public static void main() {
		System.out.println("LeapYear");
		System.out.println(LeapYear.isLeapYear(-1600));
		System.out.println(LeapYear.isLeapYear(1600));
		System.out.println(LeapYear.isLeapYear(2017));
		System.out.println(LeapYear.isLeapYear(2000));
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

}

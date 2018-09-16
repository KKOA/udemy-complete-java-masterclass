package ch05.challenges;

public class BarkingDog {
	public static boolean bark(boolean barking, int hour) {
		if (hour < 0 || hour > 23)
			return false;
		if (barking && (hour < 8 || hour == 23))
			return true;
		return false;

	}
}

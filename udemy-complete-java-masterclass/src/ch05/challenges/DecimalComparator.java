package ch05.challenges;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		if (x < 0 && y < 0) {
			x = Math.abs(x);
			y = Math.abs(y);
		}

		x = Math.floor(x * 1000);
		y = Math.floor(y * 1000);

		return (x == y);
	}
}

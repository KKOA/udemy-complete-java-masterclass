package ch05.challenges;

public class DecimalComparator {

	public static void main() {
		System.out.println("DecimalComparator");
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println();
	}

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

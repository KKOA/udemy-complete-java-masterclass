package ch05.challenges;

public class AreaCalculator {
	private static final int MIN = 0;

	public static void main() {
		System.out.println("AreaCalculator");
		System.out.println(AreaCalculator.area(5.0));
		System.out.println(AreaCalculator.area(-1));
		System.out.println(AreaCalculator.area(5.0, 4.0));
		System.out.println(AreaCalculator.area(-1.0, 4.0));

		System.out.println(AreaCalculator.area(5.0));
		System.out.println(AreaCalculator.area(-1));
		System.out.println(AreaCalculator.area(5.0, 4.0));
		System.out.println(AreaCalculator.area(-1.0, 4.0));
		System.out.println();
	}

	public static double area(double radius) {
		if (radius < MIN) {
			return -1;
		}
		return Math.pow(radius, 2) * Math.PI;
	}

	public static double area(double x, double y) {
		if ((x < MIN) || (y < MIN)) {
			return -1;
		}
		return x * y;
	}
}

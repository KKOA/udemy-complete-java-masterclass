package ch05.challenges;

public class TeenNumberChecker {

	public static void main() {
		System.out.println("TeenNumberChecker");
		System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
		System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
		System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
		System.out.println();
	}

	public static boolean hasTeen(int x, int y, int z) {
		if (isTeen(x) || isTeen(y) || isTeen(z))
			return true;
		return false;
	}

	public static boolean isTeen(int x) {
		return x <= 19 && x >= 13;
	}
}

package ch05.challenges;

public class TeenNumberChecker {
	public static boolean hasTeen(int x, int y, int z) {
		if (isTeen(x) || isTeen(y) || isTeen(z))
			return true;
		return false;
	}

	public static boolean isTeen(int x) {
		return x <= 19 && x >= 13;
	}
}

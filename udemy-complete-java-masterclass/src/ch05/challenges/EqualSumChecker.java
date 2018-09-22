package ch05.challenges;

public class EqualSumChecker {

	public static void main() {
		System.out.println("EqualSumChecker");
		System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
		System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
		System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
		System.out.println();
	}

	public static boolean hasEqualSum(int x, int y, int z) {
		if (x + y == z)
			return true;
		return false;
	}
}

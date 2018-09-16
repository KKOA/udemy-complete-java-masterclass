package ch05.exercises;

public class SumNumbers {
	public static int sumNumbers(int a, int b) {
		return a + b;
	}

	public static int sumNumbers(int a, int b, int c) {
		return sumNumbers(a, b) + c;
	}

	public static int sumNumbers(int a, int b, int c, int d) {
		return sumNumbers(a, b, c) + d;
	}
}

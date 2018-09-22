package ch06.exercises;

class DoWhileLoop {
	public static void main() {
		System.out.println("DoWhileLoop");
		System.out.println("do while vs while");
		System.out.println("do while");
		int count = 1;
		do {
			System.out.println("Count value is " + count);
			count++;// without this you get stuck in an infinite loop
		} while (count < 6); // Always execute at least once because condition check
		System.out.println();
		// While equivalent

		System.out.println("while");
		count = 1;
		while (count != 6) {
			System.out.println("Count value is " + count);
			count++;// without this you get stuck in an infinite loop
		}
		System.out.println();

		// InfiniteLoop
		// int count = 6;
		// do {
		// System.out.println("Count value is " + count);
		// count++;// without this you get stuck in an infinite loop
		// } while (count < 6); // Always execute at least once because condition check
		// at the end of iteration which this result in condition being checked after
		// the contents of an iteration

	}
}

package ch06.exercises;

class WhileLoop {
	public static void main() {
		System.out.println("WhileLoop ");
		System.out.println("while vs for");
		System.out.println("While");
		int count = 1;
		while (count != 6) {
			System.out.println("Count value is " + count);
			count++;// without this you get stuck in an infinite loop
		}
		System.out.println();
		System.out.println("for");
		// For loop equivalent
		for (count = 1; count != 6; count++) {
			System.out.println("Count value is " + count);
		}
		System.out.println();

		System.out.println("Alternative approach using while");
		count = 1;
		while (true) {
			if (count == 6)// Without
				break; // escape the loop
			System.out.println("Count value is " + count);
			count++;
		}
		System.out.println();

		// Loop never executing because condition is false
		count = 6;
		while (count != 6) {
			System.out.println("Count value is " + count);
			count++;// without this you get stuck in an infinite loop
		}
		// For loop equivalent
		for (count = 6; count != 6; count++) {
			System.out.println("Count value is " + count);
		}
		System.out.println();

	}
}

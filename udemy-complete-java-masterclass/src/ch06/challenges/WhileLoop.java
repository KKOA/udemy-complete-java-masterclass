package ch06.challenges;

public class WhileLoop {
	public static void main() {
		int number = 4, finishNumber = 20;

		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number))
				continue; //
			System.out.println(number + " is an even number.");
		}

	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}

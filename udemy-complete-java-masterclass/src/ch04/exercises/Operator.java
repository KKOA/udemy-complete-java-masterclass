package ch04.exercises;

public class Operator {
	public static void main() {
		System.out.println("Operator");
		int result = 1 + 2;
		System.out.println(" 1 + 2 = " + result);

		int previousResult = result;

		result = result - 1;
		// shorthand result -= 1
		System.out.println(previousResult + " - 1 = " + result);

		previousResult = result;
		result = result * 10;
		// shorthand result *= 10
		System.out.println(previousResult + " * 10 = " + result);

		previousResult = result;
		result = result / 5;
		// shorthand result /= 10
		System.out.println(previousResult + " / 5 = " + result);

		previousResult = result;
		result = result % 3;
		// shorthand result %= 10
		System.out.println(previousResult + " % 3 = " + result);

		previousResult = result;
		result = result + 1;
		// shorthand result += 1
		System.out.println(previousResult + " + 1 = " + result);

		result++;
		System.out.println("Result is now " + result);

		result--;
		System.out.println("Result is now " + result);

		boolean isAlien = false;
		// Assignment
		if (isAlien == false)
			System.out.println("Its is not an alien");
		// Executed if variable's value is equal to boolean false, not false as string

		int topScore = 90;
		if (topScore != 100)
			System.out.println("You got the high score");
		// Executed if topScore not equal to 100;

		if (topScore >= 80)
			System.out.println("Greater or Equal to 80");
		// Executed if topScore greater than or equal to 80

		if (topScore <= 85)
			System.out.println("Less than or Equal to 85");
		// Executed if topScore less than or equal to 85

		int secondTopScore = 81;
		if ((topScore > 80) && (secondTopScore < 80))
			System.out.println("Both were greater than 80");
		// executed only if the condition on either side && are true

		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("One of these tests is true");
			// executed only if at least one of condition are true
		}

		secondTopScore = 95;
		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("One of these tests is true");
			// executed only if at least one of condition are true
		}

		// int newValue = 50;
		// if (newValue = 20)
		// System.out.println("This is not supposed to happen");
		// Throw error because result of calculation must be of type boolean

		boolean isCar = false;
		if (isCar = true)
			System.out.println("This is not supposed to happen");
		// Use == instead = for equality test
		// Otherwise this will always executed because result calculation is what is
		// tested
		if (isCar == true) // same as if(isCar)
			System.out.println("This is supposed to happen");

		boolean wasCar = isCar ? true : false;
		// condition ? executed if true : executed if false
		if (wasCar) {
			System.out.println("wasCar is true");
		}
		System.out.println();

	}
}

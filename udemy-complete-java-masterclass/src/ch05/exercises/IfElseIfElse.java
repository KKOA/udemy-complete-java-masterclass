package ch05.exercises;

public class IfElseIfElse {
	public static void main() {
		boolean gameOver = true;
		int score = 5000, bonus = 100;
		int levelCompleted = 5;

		if (score == 5000)
			System.out.println("Your score was 5000");
		System.out.println("This was executed");
		// The line above is always executed.
		// Without explicit telling java using braces, only the next statement after the
		// if is affected the condition

		if (score < 5000 & score > 1000) {
			// Only executed if both left and right condition is met
			System.out.println("Score greater than 5000 and less than 1000");
		}

		if (score < 5000) {
			System.out.println("Your score was 5000");
			System.out.println("This was executed");
		} else if (score < 1000) {
			System.out.println("Less than 1000");
			// Only executed if the all previous if condition belonging to same chain fails
		} else {
			System.out.println("Got here");
			// Only executed if the all previous if condition belonging to same chain fails
		}

		if (gameOver) {
			// shorthand for gameOver == true
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		// finalScore cannot be access outside of if code block.
		// java automatically delete any variable declare inside of the block once the
		// block process.

//		System.out.println(finalScore);

	}
}

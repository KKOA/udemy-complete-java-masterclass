package ch05.exercises;

public class Method {
	public static void main() {
		boolean gameOver = true;
		int score = 800, bonus = 100;
		int levelCompleted = 5;

		calculateScore(gameOver, score, levelCompleted, bonus);
		// Call method passing several arguments

		calculateScore(true, 10000, 8, 200);

		int highScore = calculateScore2(true, 10000, 8, 200); // Store return value from custom method
		System.out.println("Your final score was " + highScore);
	}

	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		// accessor [class-method] return-type name-of-method (parameter with expect
		// data type)

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
		// finalScore cannot be access outside of if code block.
		// java automatically delete any variable declare inside of the block once the
		// block process.
	}

	public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
		// accessor [class-method] return-type name-of-method (parameter with expect
		// data type)
		// if return-type is not void then method must have a return value matching the
		// return-type

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
			// lines after process return statement are not executed
		}
		return -1;
	}
}

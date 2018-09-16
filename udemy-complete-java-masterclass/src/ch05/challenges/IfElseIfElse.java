package ch05.challenges;

public class IfElseIfElse {
	public static void main() {
		boolean gameOver = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

	}
}

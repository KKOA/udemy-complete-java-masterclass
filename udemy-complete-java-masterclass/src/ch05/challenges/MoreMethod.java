package ch05.challenges;

public class MoreMethod {
	public static void main() {
		// calculateHighScorePosition(1500);
		System.out.println("More Method");
		displayHighScorePosition("keith", calculateHighScorePosition(1500));

		displayHighScorePosition("Carol", calculateHighScorePosition(1000));
		displayHighScorePosition("Rosie", calculateHighScorePosition(900));

		displayHighScorePosition("George", calculateHighScorePosition(500));
		displayHighScorePosition("Amy", calculateHighScorePosition(400));
		displayHighScorePosition("Julian", calculateHighScorePosition(400));

		displayHighScorePosition("Tom", calculateHighScorePosition(50));
		System.out.println();
	}

	public static void displayHighScorePosition(String name, int pos) {
		// procedure is method with return type of type void
		System.out.println(name + " managed to get into position " + pos + " on the highscore table");
	}

	public static int calculateHighScorePosition(int score) {

		if (score >= 1000)
			return 1;
		else if (score >= 500)
			return 2;
		else if (score >= 100)
			return 3;
		return 4;

	}
}

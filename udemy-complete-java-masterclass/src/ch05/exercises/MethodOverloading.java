package ch05.exercises;

public class MethodOverloading {
	public static void main() {
		// Java select which version to run based on parameter types passed
		System.out.println(calculateScore("Tim", 500));
		System.out.println(calculateScore(500));
		System.out.println(calculateScore());
		// System.out.println(calculateScore(100, 500));
		// Throws an error
		// if the incorrect number of arguments
		// if the types of any arguments are incorrect or not can
		// cannot be converted to the correct type to match any method signatures

		System.out.println();
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unamed player scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player, no player score");
		return 0;
	}
	// Overloading methods, have multiple methods with same name but different
	// signature aka different parameters

}

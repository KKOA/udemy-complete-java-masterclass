package ch05.challenges;

public class PlayingCat {
	private static final int MAX_SUMMER_TEMPERATURE = 45;
	private static final int MAX_TEMPERATURE = 35;
	private static final int MIN_TEMPERATURE = 25;

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (temperature < MIN_TEMPERATURE || temperature > MAX_SUMMER_TEMPERATURE)
			return false;
		if (summer == false && temperature > MAX_TEMPERATURE)
			return false;
		return true;
	}
}

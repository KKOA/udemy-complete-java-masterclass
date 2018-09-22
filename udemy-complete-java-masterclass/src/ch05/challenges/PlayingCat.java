package ch05.challenges;

public class PlayingCat {
	private static final int MAX_SUMMER_TEMPERATURE = 45;
	private static final int MAX_TEMPERATURE = 35;
	private static final int MIN_TEMPERATURE = 25;

	public static void main() {
		System.out.println("PlayingCat");
		System.out.println(PlayingCat.isCatPlaying(true, 25));
		System.out.println(PlayingCat.isCatPlaying(true, 10));
		System.out.println(PlayingCat.isCatPlaying(true, 45));
		System.out.println(PlayingCat.isCatPlaying(true, 36));

		System.out.println(PlayingCat.isCatPlaying(false, 25));
		System.out.println(PlayingCat.isCatPlaying(false, 36));
		System.out.println(PlayingCat.isCatPlaying(false, 35));
		System.out.println(PlayingCat.isCatPlaying(false, 30));
		System.out.println();
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (temperature < MIN_TEMPERATURE || temperature > MAX_SUMMER_TEMPERATURE)
			return false;
		if (summer == false && temperature > MAX_TEMPERATURE)
			return false;
		return true;
	}
}

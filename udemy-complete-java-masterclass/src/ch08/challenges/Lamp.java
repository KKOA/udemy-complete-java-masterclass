package ch08.challenges;

public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;

	public Lamp(String style, boolean battery, int globRating) {

	}

	public void turnOn() {
		System.out.println("Lamp -> turning on");
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlobRating() {
		return globRating;
	}

}

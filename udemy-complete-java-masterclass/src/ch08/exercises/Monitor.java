package ch08.exercises;

public class Monitor {
	// fields
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	// composition
	// This because resolution class is part of Monitor class.
	// Monitor has Resolution but it is not Resolution.
	// Resolution is a component of monitor.

	// Constructor
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + ", " + y + " in colour" + color);
	}

	// Getter
	public String getModel() {
		return this.model;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public int size() {
		return this.size;
	}

	public Resolution getNativeResolution() {
		return this.nativeResolution;
	}
}
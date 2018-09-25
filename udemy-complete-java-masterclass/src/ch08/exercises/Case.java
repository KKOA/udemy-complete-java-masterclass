package ch08.exercises;

public class Case {
	// fields
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;

	// Constructor
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	// Getters
	public String getModel() {
		return this.model;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getPowerSupply() {
		return this.powerSupply;
	}

	public Dimensions getDimensions() {
		return this.dimensions;
	}

}

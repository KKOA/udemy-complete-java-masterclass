package ch07.exercises;

public class Car {// Create new class with a given name
	// access modifier class class-name
	// New create classes inherit features from java base class

	// variables that part of class are known member variables or fields
	private int doors;
	private int wheels;
	// private fields are not directly accessible
	private String model;
	private String colour;
	// access-modifiers data-type data-name
	// state component

	// Getter and setter method control how we get and set property field of the
	// class while adhering to encapsulation
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("porsche") || validModel.equals("holden"))
			this.model = model;
		else
			this.model = "Unknown";
		// When field and parameter shared same, to identify which is which we use the
		// keyword this
		// Use this when referring to the field of the class. This way java knows which
		// is which.
	}

	public String getModel() {
		return this.model;
	}
}
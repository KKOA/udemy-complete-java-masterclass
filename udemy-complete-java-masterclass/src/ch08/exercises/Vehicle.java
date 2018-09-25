package ch08.exercises;

public class Vehicle {
	// field
	private String name;

	// Constructor
	public Vehicle(String name) {
		System.out.println("Vechile Constructor called.");
		this.name = name;
	}

	// Getter
	public String getName() {
		return this.name;
	}
}

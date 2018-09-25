package ch08.exercises;

public class Car extends Vehicle {
	// Is are relationship between Car & Vehicle a.k.a Car is Vehicle
	private int doors;
	private int engineCapacity;

	// Constructor
	public Car(String name, int doors, int engineCapacity) {
		super(name);
		System.out.println("Car Constructor called.");
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}

	// Getters
	public int getDoors() {
		return this.doors;
	}

	public int getEngineCapacity() {
		return this.engineCapacity;
	}
}

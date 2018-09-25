package ch08.challenges;

public class Car {
	private String name;
	private int cyclinders;
	private boolean engine;

	private int wheels;

	public Car(String name, int cylinders) {
		this.name = name;
		this.cyclinders = cyclinders;
		this.wheels = 4;
		this.engine = true;
	}

	public String startEngine() {
		return "Car -> startEngine()";
	}

	public String accelerate() {
		return "Car -> accerelate()";
	}

	public String brake() {
		return "Car -> brake()";
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public int getCyclinders() {
		return this.cyclinders;
	}

	public int getWheels() {
		return this.wheels;
	}

	public boolean engine() {
		return this.engine;
	}
}

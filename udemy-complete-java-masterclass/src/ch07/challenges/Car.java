package ch07.challenges;

//Inherit from vechile
public class Car extends Vechile {
	// fields
	private int gears;
	private int wheels;
	private int doors;
	private boolean isManual;
	private int currentGear;

	// Constructor
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size); // Call Vechile constructor with arguments

		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity() velocity " + speed + " direction " + direction);
		move(speed, direction); // Call vechile move method

	}

	// Getter & setter
	public void changeCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear() Change to " + this.currentGear + " gear.");
	}

	public int getGear() {
		return this.currentGear;
	}
}
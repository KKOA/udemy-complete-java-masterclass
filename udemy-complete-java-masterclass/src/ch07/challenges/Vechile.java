package ch07.challenges;

public class Vechile {
	// fields
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection; // Degrees

	// Constructor
	public Vechile(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vechile.steer(): Steering at " + currentDirection + " degrees.");
	}

	// public void move(int velocity, int direction)
	// {
	// this.currentVelocity = velocity;
	// //this.currentDirection = direction;
	// steer(direction);
	// System.out.println("Vechile.move(): Moving at " + currentVelocity + " and in
	// direction "+ currentDirection+".");
	// }

	public void move(int velocity, int direction) {
		this.currentVelocity = velocity;
		// this.currentDirection = direction;
		steer(direction);
		System.out.println("Vechile.move(): Moving at " + currentVelocity + ".");
	}

	public void stop() {
		this.currentVelocity = 0;
		System.out.println("Vechile.stop() Vechile Stopping.");
	}

	// Getter and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return this.currentVelocity;
	}

	public void setCurrentVelocity(int velocity) {
		this.currentVelocity = velocity;
	}

	public int getCurrentDirection() {
		return this.currentDirection;
	}

	public void setDirection(int direction) {
		this.currentDirection = direction;
	}

}

//All class are automically inherit from java object class
package ch07.exercises;

public class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		System.out.println("Shape Constructor called");
		// Initialise variables
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

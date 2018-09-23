package ch07.exercises;

public class Rectangle extends Shape {
	private int x;
	private int y;
	private int width;
	private int height;

	// Constructors
	public Rectangle() {
		this(0, 0); // Calls constructor with matching method signature
		// Also known has constructor chaining
		System.out.println("Rectangle First Constructor called");
	}

	public Rectangle(int width, int height) {
		this(0, 0, width, height); // Call 3rd constructor
		// Must be first line execute otherwise an error is thrown;
		System.out.println("Rectangle Second Constructor called");
	}

	public Rectangle(int x, int y, int width, int height) {
		// Initialise variables
		super(x, y); // Calls constructor from parent class (Shape)
		// Must be first line execute otherwise an error is thrown;
		// this() and super() in same constructor
		System.out.println("Rectangle Third Constructor called");
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}

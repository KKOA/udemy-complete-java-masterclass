package ch07.exercises;

public class Dog extends Animal {

	// fields that are only existing in the instance of this class or it's
	// subclasses.
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
	// String name, int size, int weight, int eyes, int legs, int tail, int teeth,
	// String
	{
		super(name, 1, 1, size, weight);
		// super tell java call constructor for the class that we are extending from
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;

	}

	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}

	public int getTail() {
		return tail;
	}

	public int getTeeth() {
		return teeth;
	}

	public String getCoat() {
		return coat;
	}

	public void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override // Annotation indicates that method Override parent method with same name
	public void eat() {
		// Override parent method with same name
		System.out.println("Dog.eat() called");
		chew();
		super.eat();// Call parent eat method
		System.out.println();
	}

	// Dog also inherit the animal methods

	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);// move() rather super.move() if you plan to override method
	}

	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
		System.out.println();
	}

}

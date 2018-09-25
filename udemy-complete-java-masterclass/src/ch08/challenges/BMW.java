package ch08.challenges;

public class BMW extends Car {
	public BMW(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "BMW -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "BMW -> accerelate()";
	}

	@Override
	public String brake() {
		return "BMW -> brake()";
	}
}

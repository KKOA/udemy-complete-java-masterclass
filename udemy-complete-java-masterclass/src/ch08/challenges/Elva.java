package ch08.challenges;

public class Elva extends Car {
	public Elva(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Elva -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Elva -> accerelate()";
	}

	@Override
	public String brake() {
		return "Elva -> brake()";
	}
}

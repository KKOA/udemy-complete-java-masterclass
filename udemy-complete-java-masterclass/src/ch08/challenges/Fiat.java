package ch08.challenges;

public class Fiat extends Car {
	public Fiat(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Fiat -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Fiat -> accerelate()";
	}

	@Override
	public String brake() {
		return "Fiat -> brake()";
	}
}

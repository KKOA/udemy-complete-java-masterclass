package ch08.exercises;

class Jaws extends Movie {
	// Constructor
	public Jaws() {
		super("Jaws");
	}

	@Override
	public String plot() {
		return "A shark eats lots of people";
	}

}

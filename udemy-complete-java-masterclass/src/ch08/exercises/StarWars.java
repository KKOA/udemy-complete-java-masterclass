package ch08.exercises;

public class StarWars extends Movie {
	// Constructor
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over the universe";
	}
}
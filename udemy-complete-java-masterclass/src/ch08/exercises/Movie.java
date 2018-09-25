package ch08.exercises;

class Movie {
	private String name;

	// Constructor
	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String plot() {
		return "No plot here";
	}
}

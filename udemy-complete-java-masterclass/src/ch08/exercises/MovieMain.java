package ch08.exercises;

public class MovieMain {

	public static void main() {

		// Movies
		for (int i = 0; i < 11; i++) {
			Movie movie1 = randomMovie();
			System.out.println("Movie Name : " + movie1.getName());
			System.out.println("Movie Plot : " + movie1.plot());
			System.out.println();
		}

		// Subclass can override super method with own.
		// Polymorphism is when two or subclass inherit from parent,
		// but implement parent method differently.

	}

	public static Movie randomMovie() {
		// return base classes because all classes generated are subclass of the base
		// class
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was " + randomNumber);
		switch (randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		default:
			return null;

		}
	}

}

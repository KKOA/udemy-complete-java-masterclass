package ch08.exercises;

public class MyMain {
	public static void main() {

		System.out.println("Chaper 8 Exercises");
		System.out.println();
		BadPlayer player = new BadPlayer();
		player.name = "Tim";
		player.health = 20; // No way guarenting the player health is set
		player.weapon = "Sword"; // Any validation can be bypassed

		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining Health " + player.HealthRemaining());

		damage = -11;
		player.health = 200; // Problem can field directly
		player.loseHealth(damage);
		System.out.println("Remaining Health " + player.HealthRemaining());

		GoodPlayer player2 = new GoodPlayer("Keith", 50, "Sword");
		System.out.println("Remaining Health " + player2.HealthRemaining());

		GoodPlayer player3 = new GoodPlayer("Tom", 200, "Sword");
		System.out.println("Remaining Health " + player3.HealthRemaining());
		System.out.println();

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

		System.out.println();
		System.out.println("End of Chaper 8 Exercises");
		System.out.println();

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

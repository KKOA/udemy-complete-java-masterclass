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
		System.out.println("End of Chaper 8 Exercises");
		System.out.println();
	}

}

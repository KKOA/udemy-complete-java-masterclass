package ch08.exercises;

public class PlayerMain {

	public static void main() {
		BadPlayer player = new BadPlayer();
		player.name = "Tim";
		player.health = 20; // No way guarenting the player health is set
		player.weapon = "Sword"; // Any validation can be bypassed

		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining Health " + player.HealthRemaining());

		damage = -11;
		player.health = 200; // Problem we can update field directly
		player.loseHealth(damage);
		System.out.println("Remaining Health " + player.HealthRemaining());
		System.out.println();
		GoodPlayer player2 = new GoodPlayer("Keith", 50, "Sword");
		System.out.println("Remaining Health " + player2.HealthRemaining());

		GoodPlayer player3 = new GoodPlayer("Tom", 200, "Sword");
		System.out.println("Remaining Health " + player3.HealthRemaining());
		System.out.println();

	}

}

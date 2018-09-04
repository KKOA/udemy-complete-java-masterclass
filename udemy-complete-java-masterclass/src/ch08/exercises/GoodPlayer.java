package ch08.exercises;

public class GoodPlayer {

//hide field from outside classses
	private String name;
	private int hp = 100; // Change name of variable do not effect any classes outside
	private String weapon;

	// Constructor
	public GoodPlayer(String name, int health, String weapon) {
		// Prevent user from enter invalid health
		this.name = name;
		if ((health >= 0) && (health <= 100)) {
			this.hp = health;

		}
		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		this.hp = this.hp - damage;
		if (this.hp <= 0)
			System.out.println("Player knockout");

	}

	public int HealthRemaining() {
		return hp;
	}

}

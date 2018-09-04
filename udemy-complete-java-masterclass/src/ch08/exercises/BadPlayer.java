package ch08.exercises;


public class BadPlayer {

	public String name;// Changes to internal class breaks any class calling this class
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if(this.health <= 0)
		{
			System.out.println("Player knockout");
			
		}
		
	}

	// Getter
	public int HealthRemaining() {
		return health;
	}
	

}


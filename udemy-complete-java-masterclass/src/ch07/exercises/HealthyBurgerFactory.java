package ch07.exercises;

public class HealthyBurgerFactory extends BurgerFactory {
	@Override
	public HealthyBurger createBurger() {
		// Allow because HealthyBurger is sub class of burger
		return new HealthyBurger();
	}
}
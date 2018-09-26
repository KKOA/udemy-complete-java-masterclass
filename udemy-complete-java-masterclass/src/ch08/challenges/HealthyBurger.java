package ch08.challenges;

public class HealthyBurger extends Burger {

	private String additionHealth1Name;
	private double additionHealth1Price;

	private String additionHealth2Name;
	private double additionHealth2Price;

	public HealthyBurger(String meat, double price) {
		super("Healthy", "Brown rye bread roll", meat, price);
	}

	public void addBurgerHealth1Addition(String name, double price) {
		this.additionHealth1Name = name;
		this.additionHealth1Price = price;
	}

	public void addBurgerHealth2Addition(String name, double price) {
		this.additionHealth2Name = name;
		this.additionHealth2Price = price;
	}

	@Override
	public double calculatePrice() {

		// System.out.println(this.name + "burger on a " + this.bread_type + " roll
		// price is " + this.price);
		double total = super.calculatePrice();

		if (getAdditionHealth1Name() != null) {
			total += getAdditionHealth1Price();
			System.out.println("Added " + getAdditionHealth1Name() + " : £" + getAdditionHealth1Price());
		}

		if (getAdditionHealth2Name() != null) {
			total += getAdditionHealth2Price();
			System.out.println("Added " + getAdditionHealth2Name() + " : £" + getAdditionHealth2Price());
		}

		return total;
	}

	public String getAdditionHealth1Name() {
		return this.additionHealth1Name;
	}

	public String getAdditionHealth2Name() {
		return this.additionHealth2Name;
	}

	public double getAdditionHealth1Price() {
		return this.additionHealth1Price;
	}

	public double getAdditionHealth2Price() {
		return this.additionHealth2Price;
	}

}

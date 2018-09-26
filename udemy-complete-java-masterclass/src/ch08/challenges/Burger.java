package ch08.challenges;

public class Burger {

	// fields
	private String name;
	private String meat;
	private double price;
	private String bread_type;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public Burger(String name, String bread_type, String meat, double price) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.bread_type = bread_type;
	}

	public void addBurgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addBurgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addBurgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addBurgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double calculatePrice() {

		double total = getPrice();
		System.out.println(this.name + " burger on a " + this.bread_type + " roll  with " + this.getMeat()
				+ " meat price is £" + formatCurrencyOuput(this.getPrice()));
		if (getAddition1Name() != null) {
			total += getAddition1Price();
			// System.out.println("Added " + getAddition1Name() + " : £" +
			// getAddition1Price());
			System.out.println("Added " + getAddition1Name() + " : £" + formatCurrencyOuput(getAddition1Price()));

		}

		if (getAddition2Name() != null) {
			total += getAddition2Price();
			System.out.println("Added " + getAddition2Name() + " : £" + formatCurrencyOuput(getAddition2Price()));
		}

		if (getAddition3Name() != null) {
			total += getAddition3Price();
			System.out.println("Added " + getAddition3Name() + " : £" + formatCurrencyOuput(getAddition3Price()));
		}

		if (getAddition4Name() != null) {
			total += getAddition4Price();
			System.out.println("Added " + getAddition4Name() + " : £" + formatCurrencyOuput(getAddition4Price()));
		}

		return total;
	}

	public String formatCurrencyOuput(double amount) {
		return String.format("%.2f", amount);
	}

	// Getter
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getMeat() {
		return this.meat;
	}

	public String getAddition1Name() {
		return addition1Name;
	}

	public double getAddition1Price() {
		return addition1Price;
	}

	public String getAddition2Name() {
		return addition2Name;
	}

	public double getAddition2Price() {
		return addition2Price;
	}

	public String getAddition3Name() {
		return addition3Name;
	}

	public double getAddition3Price() {
		return addition3Price;
	}

	public String getAddition4Name() {
		return addition4Name;
	}

	public double getAddition4Price() {
		return addition4Price;
	}

}

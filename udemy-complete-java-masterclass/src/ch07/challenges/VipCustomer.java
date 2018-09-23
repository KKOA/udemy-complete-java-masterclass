package ch07.challenges;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;

	// Each constructor call third constructor with either input or default values;
	public VipCustomer() {
		this("Default name", 0.00, "Default email");
	}

	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "Default email");
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public double getCreditLimit() {
		return this.creditLimit;
	}

	public String getEmail() {
		return this.email;
	}

}

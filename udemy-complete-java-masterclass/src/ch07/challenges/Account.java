package ch07.challenges;

public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNumber;

	private static final int MIN_BALANCE = 0;

	public Account() {
		// Constructors are called when a new instance of the class is created
		this("000000");
		System.out.println("Empty constructor called");
	}

	public Account(String number) {
		this(number, 2.50, "Default customer name", "Default Address", "Default phone number");
		System.out.println("Acount constructor with parameters called");
		// Call another constructor which different signature
		// This must be first line of the constructor otherwise an error is shown
	}

	public Account(String number, double balance, String customerName, String customerEmail,
			String customerPhoneNumber) {
		// By default java implicit create constructor for class with no arguments.

		// However if you explicit create constructor for class, you are responsible
		// for all variation of constructor
		// If call a constructor with incorrect number of argument, java throw an
		// error.

		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void withdraw(double amount) {
		if (this.balance - amount >= MIN_BALANCE) {
			this.balance -= amount;
			System.out.println("Withdrawing : " + amount);
			System.out.println("New balance is : " + this.getBalance());
		} else {
			System.out.println(
					"Insufficient funds cannot withdraw " + amount + " from a balance of " + this.getBalance());
		}
		System.out.println();

	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Depositing : " + amount);
		System.out.println("New balance is : " + this.balance);
		System.out.println();
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}
}
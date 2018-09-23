package ch07.challenges;

public class AccountMain {
	public static void main() {
		System.out.println("Account");
		Account account1 = new Account();
//		account1.setNumber("456789");

		account1.setCustomerName("Joey");
		account1.setCustomerEmail("joey@email.com");
		account1.setCustomerPhoneNumber("10234567890");

		System.out.println("Account details");
		System.out.println("Number : " + account1.getNumber());
		System.out.println("Name : " + account1.getCustomerName() + "'s account details");
		System.out.println("Email : " + account1.getCustomerEmail());
		System.out.println("PhoneNumber : " + account1.getCustomerPhoneNumber());
		System.out.println("Balance : " + account1.getBalance());
		System.out.println();

		account1.withdraw(100.0);

		account1.deposit(50.0);
		account1.withdraw(100.0);

		account1.deposit(51.0);
		account1.withdraw(100.0);

		account1.getCustomerName();

		Account account2 = new Account("999999");

		System.out.println("Account details");
		System.out.println("Number : " + account2.getNumber());
		System.out.println("Name : " + account2.getCustomerName() + "'s account details");
		System.out.println("Email : " + account2.getCustomerEmail());
		System.out.println("PhoneNumber : " + account2.getCustomerPhoneNumber());
		System.out.println("Balance : " + account2.getBalance());
		System.out.println();

		System.out.println("Change intial balance to 50.00");
		account2.setBalance(50.00);
		account2.deposit(50.0);
		account2.withdraw(100.0);

		Account account3 = new Account("012345", 100.00, "Keith", "keith@email.com", "12345678910");

		System.out.println("Account details");
		System.out.println("Number : " + account3.getNumber());
		System.out.println("Name : " + account3.getCustomerName() + "'s account details");
		System.out.println("Email : " + account3.getCustomerEmail());
		System.out.println("PhoneNumber : " + account3.getCustomerPhoneNumber());
		System.out.println("Balance : " + account3.getBalance());
		System.out.println();
	}
}

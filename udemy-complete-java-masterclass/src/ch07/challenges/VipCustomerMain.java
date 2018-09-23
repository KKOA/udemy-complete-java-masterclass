package ch07.challenges;

public class VipCustomerMain {
	public static void main() {
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getClass().getSimpleName());
		System.out.println(person1.getName());
		System.out.println(person1.getCreditLimit());
		System.out.println(person1.getEmail());
		System.out.println();

		VipCustomer person2 = new VipCustomer("Bob", 25000.00);
		System.out.println(person2.getName());
		System.out.println(person2.getCreditLimit());
		System.out.println(person2.getEmail());
		System.out.println();

		VipCustomer person3 = new VipCustomer("John", 25000.00, "john@gmail.co.uk");
		System.out.println(person3.getName());
		System.out.println(person3.getCreditLimit());
		System.out.println(person3.getEmail());
	}
}

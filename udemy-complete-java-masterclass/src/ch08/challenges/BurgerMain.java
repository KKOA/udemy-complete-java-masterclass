package ch08.challenges;

public class BurgerMain {

	public static void main() {
		/*
		 * The purpose of the application is to help a fictitious company called Bills
		 * Burgers to manage their process of selling hamburgers.
		 * 
		 * Our application will help Bill to select types of burgers, some of the
		 * additional items (additions) to be added to the burgers and pricing.
		 * 
		 * We want to create a base hamburger, but also two other types of hamburgers
		 * that are popular ones in Bills store. The basic hamburger should have the
		 * following items. Bread roll type, meat and up to 4 additional additions item
		 * that the customer can select to be added to the burger. Each one of these
		 * items gets charged an additional price so you need some way to track how many
		 * items got added and to calculate the final price (base burger with all the
		 * additions). This burger has a base price and the additions are all separately
		 * priced (up to 4 additions, see above). Create a Hamburger class to deal with
		 * all the above. The constructor should only include the roll type, meat and
		 * price, can also include name of burger or you can use a setter. Also create
		 * two extra varieties of Hamburgers (subclasses) to cater for
		 * 
		 * a) Healthy burger (on a brown rye bread roll), plus two addition items that
		 * can be added. The healthy burger can have 6 items (Additions) in total. hint:
		 * you probably want to process the two additional items in this new class
		 * (subclass of Hamburger), not the base class (Hamburger), since the two
		 * additions are only appropriate for this new class (in other words new burger
		 * type).
		 * 
		 * b) Deluxe hamburger - comes with chips and drinks as additions, but no extra
		 * additions are allowed. hint: You have to find a way to automatically add
		 * these new additions at the time the deluxe burger object is created, and then
		 * prevent other additions being made. All 3 classes should have a method that
		 * can be called anytime to show the base price of the hamburger plus all
		 * additionals, each showing the addition name, and addition price, and a
		 * grand/final total for the burger (base price + all additions) For the two
		 * additional classes this may require you to be looking at the base class for
		 * pricing and then adding totals to final price.
		 */

		Burger burger1 = new Burger("Basic", "white", "Pork", 3.56);
		burger1.addBurgerAddition1("Egg", 1.20);
		burger1.addBurgerAddition2("Lettuce", 0.50);
		burger1.addBurgerAddition3("Tomato", 0.35);
		burger1.addBurgerAddition4("Sweetcorn", 0.75);
		System.out.println("Total Price : " + String.format("%.2f", burger1.calculatePrice()));
		System.out.println();

		Burger burger2 = new Burger("Basic", "Brown", "Chicken", 4.5);
		burger2.addBurgerAddition1("Egg", 1.20);
		burger2.addBurgerAddition4("Sweetcorn", 0.75);
		System.out.println("Total Price : " + String.format("%.2f", burger2.calculatePrice()));
		System.out.println();

		Burger burger3 = new Burger("Basic", "Naan", "Turkey", 4.5);
		System.out.println("Total Price : " + String.format("%.2f", burger3.calculatePrice()));
		System.out.println();

		HealthyBurger burger4 = new HealthyBurger("Beef", 1);
		burger4.addBurgerAddition1("Egg", 1.20);
		burger4.addBurgerAddition2("Lettuce", 0.50);
//		burger4.addBurgerAddition3("Tomato", 0.35);
		burger4.addBurgerAddition4("Sweetcorn", 0.75);
		burger4.addBurgerHealth1Addition("Onion", 0.90);
		burger4.addBurgerHealth2Addition("Pepper", 0.45);
		System.out.println("Total Price : " + String.format("%.2f", burger4.calculatePrice()));

		System.out.println();
		DeluxeBurger burger5 = new DeluxeBurger("sourdough", "Turkey", 1);
		burger5.addBurgerAddition1("Egg", 1.20);
		burger5.addBurgerAddition2("Lettuce", 0.50);
//		burger4.addBurgerAddition3("Tomato", 0.35);
		burger5.addBurgerAddition4("Sweetcorn", 0.75);
		System.out.println("Total Price : " + String.format("%.2f", burger5.calculatePrice()));

	}

}

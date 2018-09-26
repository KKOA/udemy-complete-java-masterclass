package ch08.challenges;

public class DeluxeBurger extends Burger {

	// Class constant
	public static final String ADDITIONAL_ITEM_ERROR = "Cannot not add additonal item to a deluxe burger";

	// constructor
	public DeluxeBurger(String bread_type, String meat, double price) {
		super("Deluxe", bread_type, meat, price);
		super.addBurgerAddition1("chips", 2.00);
		super.addBurgerAddition2("drink", 3.00);
	}

	@Override
	public void addBurgerAddition1(String name, double price) {
		displayAdditional_Item_Error();
	}

	@Override
	public void addBurgerAddition2(String name, double price) {
		displayAdditional_Item_Error();
	}

	@Override
	public void addBurgerAddition3(String name, double price) {
		displayAdditional_Item_Error();
	}

	@Override
	public void addBurgerAddition4(String name, double price) {
		displayAdditional_Item_Error();
	}

	public static void displayAdditional_Item_Error() {
		System.out.println(ADDITIONAL_ITEM_ERROR);
	}

}

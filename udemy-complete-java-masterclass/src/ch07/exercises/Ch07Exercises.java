package ch07.exercises;

public class Ch07Exercises {

	public static void main() {
		System.out.println("Chapter 7 Exercises");
		System.out.println();

		CarMain.main();
		AnimalMain.main();
		// Fish
		HouseMain.main();
		SuperSubClassMain.main();
		ShapeMain.main();

		// Dogs
		OverLoadingDog dog1 = new OverLoadingDog();
		dog1.bark();
		dog1.bark(5);
		System.out.println();
//		OverridingGermanShepherd
		OverridingGermanShepherd dog2 = new OverridingGermanShepherd();
		dog2.bark();
		System.out.println();

		// Burgers
		// HealthyBurger
		// BurgerFactory
		// HealthyBurgerFactory

		StaticInstanceMain.main();

		System.out.println();
		System.out.println("End of Chapter 7 Exercises");
		System.out.println();
	}

}

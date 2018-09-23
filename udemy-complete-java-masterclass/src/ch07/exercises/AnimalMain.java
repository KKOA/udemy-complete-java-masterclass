package ch07.exercises;

public class AnimalMain {

	public static void main() {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog1 = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		System.out.println(dog1.getClass().getSimpleName());

//		dog1.getCoat();
		dog1.eat(); // Call inherited method from animal
		dog1.walk();
		dog1.run();

		Fish fish = new Fish("lucky", 3, 5, 7, 2, 4);
		fish.swim(3);
		fish.rest();
		System.out.println();
	}

}

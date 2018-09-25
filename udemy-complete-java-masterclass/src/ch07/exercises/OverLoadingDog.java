package ch07.exercises;

public class OverLoadingDog {

	/*
	 * Overloading Two or more methods in class with same name but different
	 * parameters.Having the same name make it easier ti remember. Sometimes refer
	 * to as Compile Time Polymorphism because compiler decides which method to be
	 * called base on name return type and argument pass to it.
	 */

	public void bark() {
		System.out.println("Woof");
	}

	public void bark(int number) {
		// Same method name and different paramters aka overloading method
		for (int i = 0; i < number; i++) {
			System.out.println("Woof");
		}
	}

	/*
	 * Overloading rules - method must have same method name and must different
	 * parameters - May have different return types - May have different access
	 * modifiers - May throw different execeptions - static method can overloaded -
	 * method can also be treated as overload in the subclass of that class. This is
	 * because sub class inherits one version of the method from parent class.
	 */
}

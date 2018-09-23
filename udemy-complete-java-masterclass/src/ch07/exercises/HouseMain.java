package ch07.exercises;

public class HouseMain {
	public static void main() {
		House blueHouse = new House("blue");
		System.out.println(blueHouse.getClass().getSimpleName());
		// New instance of house is created
		// referencing object in memory
		House anotherHouse = blueHouse;
		// Both anotherHouse and blueHouse referencing same object

		System.out.println(" House color :" + blueHouse.getColor()); // blue
		System.out.println(" House color :" + anotherHouse.getColor()); // blue

		// Any changes to one reference are reflected in all other reference, that
		// reference this object
		anotherHouse.setColor("red");
		System.out.println(" House color :" + blueHouse.getColor());// red
		System.out.println(" House color :" + anotherHouse.getColor());// red

		House greenHouse = new House("green");
		// New instance of house is created
		anotherHouse = greenHouse;
		// dereferencing anotherHouse and referencing same instance of house as
		// greenhouse

		System.out.println(" House color :" + blueHouse.getColor());// red
		System.out.println(" House color :" + greenHouse.getColor());// green
		System.out.println(" House color :" + anotherHouse.getColor());// green

		// Object cannot be access directly everything is done using references.

		System.out.println();
	}
}

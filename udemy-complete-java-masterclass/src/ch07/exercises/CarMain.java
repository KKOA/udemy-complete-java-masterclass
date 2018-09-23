package ch07.exercises;

public class CarMain {
	public static void main() {
		System.out.println("Car");
		Car porsche = new Car();// Create new instance of car classes
		// porsche.model = "Another Car"; Throw error because cannot access private
		// fields of class directly

		porsche.setModel("Carrera");
		// Through error if object of class has not initialise before this statement
		System.out.println("Model is " + porsche.getModel());
		// Return null because passed invalid model name to setModel

		porsche.setModel("holden");
		System.out.println("Model is " + porsche.getModel());
		System.out.println();

	}
}

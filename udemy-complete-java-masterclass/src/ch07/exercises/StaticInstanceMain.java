package ch07.exercises;

public class StaticInstanceMain {
	public static void main() {

		Calculator.printSum(5, 10);
		printHello();
		// shorthand form of CalculatorMain.main()
		// when calling a static method from within the same class;

		// bark() calling method without an attached instance throws an error
		InstanceDog rex = new InstanceDog(); // Create instance
		rex.bark(); // Call instance method
	}

	// Static method
	public static void printHello() {
		System.out.println("Hello");
	}

	// Static or Instance Method
	// Should a method be static?
	// Does is use any fields (instance fields_ or instance methods?
	// Yes - instance methhod
	// No - static method

}

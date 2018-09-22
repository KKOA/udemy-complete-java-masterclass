package ch04.exercises;

/**
 * Created 8th Aug 2015
 * 
 * @author Keith
 *
 */
public class Variable {

	public static void main() {

		System.out.println("Variable");
		// Declare and initialise variable
		int myFirstNumber = 5;
		// data-type variable-name = value

		// Reassign variable to result calculation
		myFirstNumber = 10 + 5;

		System.out.println(myFirstNumber);
		System.out.println("myFirstNumber");
		// Print out string instead of variable

		// Declare and initialise multiple variables
		int mySecondNumber = 12, myThirdNumber = 6;

		// Declare and initialise variable with value dependent on variable
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

		System.out.println(myTotal);

		int newmyTotal = 1000 - myTotal;
		// variable names are case sensitive

		System.out.println(newmyTotal);
		System.out.println();

	}

}

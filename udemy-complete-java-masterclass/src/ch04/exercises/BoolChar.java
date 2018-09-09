package ch04.exercises;

public class BoolChar {
	public static void main() {
		char myChar = '&';
		// Can only contain one characters
		System.out.println(myChar);
		myChar = '\u00A9';
		// Can also unicode characters (special characters that support multiple
		// languages)
		/* Start with slash u */
		System.out.println("Unicode ouput : " + myChar);

		boolean myBoolean = true;
		// can only take two value true or false
		System.out.println(myBoolean);

	}
}

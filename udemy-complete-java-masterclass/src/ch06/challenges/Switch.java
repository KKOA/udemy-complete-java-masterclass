package ch06.challenges;

public class Switch {
	public static void main() {
		char character = 'F';
		switch (character)// test this value against case
		{
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
			System.out.println("Value was " + character);
			break;
		default:
			System.out.println("Could not find A, B, C, D or E");
			break;
		}
	}
}

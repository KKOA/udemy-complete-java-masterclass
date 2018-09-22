import java.util.Scanner;

public class Main {

	private static Scanner scanner // = new Scanner(System.in)
	;

	public static void main(String[] args) {

		openScanner();

		ch03.exercises.Ch03Exercises.main();
		System.out.println();

		ch04.exercises.Ch04Exercises.main();
		System.out.println();
		ch04.challenges.Ch04Challenges.main();
		System.out.println();

		ch05.exercises.Ch05Exercises.main();
		System.out.println();
		ch05.challenges.Ch05Challenges.main();
		System.out.println();

		ch06.exercises.Ch06Exercises.main(scanner);
		System.out.println();
		ch06.challenges.Ch06Challenges.main(scanner);
		System.out.println();

//		System.out.println();
//		ch07.exercises.MyMain.main();
//		System.out.println();
//		ch07.challenges.MyMain.main();

//		ch08.exercises.MyMain.main();
//		ch08.challenges.MyMain.main();

//		ch09.exercises.MyMain.main();
//		ch09.challenges.MyMain.main();

		closeScanner();
	}

	public static void openScanner() {
		System.out.println("Opening scanner ");
		scanner = new Scanner(System.in);
		System.out.println();
	}

	public static void closeScanner() {
		System.out.println("Closing scanner ");
		scanner.close();
	}

}

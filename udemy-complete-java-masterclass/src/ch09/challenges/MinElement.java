package ch09.challenges;

import java.util.Scanner;

public class MinElement {
	// private static Scanner scanner = new Scanner(System.in);
	private static Scanner scanner;
	private static final String INVALID_MSG = "Invalid input";

	public static void main(Scanner scan) {
		scanner = scan;

		Integer count;
		while (true) {
			System.out.println("Enter count greater than 0");
			if (scanner.hasNextInt()) {

				count = scanner.nextInt();
				scanner.nextLine();

				if (count > 0)
					break;
				System.out.println(INVALID_MSG);
			} else {
				System.out.println(INVALID_MSG);
				scanner.nextLine();
			}
		}

		int[] numbers = readIntegers(count);
		printArray(numbers);
		System.out.println("Minimum value is " + findMin(numbers));

	}

	public static int[] readIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values:\r");
		for (int i = 0; i < capacity; i++) {
			while (true) {
				System.out.println("Enter a valid number");
				if (scanner.hasNextInt()) {
					array[i] = scanner.nextInt();
					System.out.println("Number added to Array");
					System.out.println();
					break;
				} else {
					System.out.println(INVALID_MSG);
					scanner.nextLine();
				}
			}
		}
		scanner.nextLine();
		return array;
	}

	public static Integer findMin(int[] array) {
		Integer min = null;
		for (int element : array) {
			if ((min == null) || (element < min))
				min = element;
		}
		return min;
	}

	public static void printArray(int[] array) {
		System.out.println("Printing Array");
		int arrayLen = array.length;
		for (int i = 0; i < arrayLen; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
		System.out.println("");
	}
}

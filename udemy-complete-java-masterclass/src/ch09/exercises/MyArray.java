package ch09.exercises;

import java.util.Scanner;

public class MyArray {

	// private static Scanner scanner = new Scanner(System.in);
	private static Scanner scanner;

	public static void main(Scanner scan) {
		scanner = scan;
		int[] myIntArray = new int[10];
		// data-type name = new data-type[size]
		// All the value int the array are set default

		// myIntArray[0] = "Word";
		// You cannot a data of different type to array declaration type to the array
		// E.g. String into an int array will result Type mismatch

		myIntArray[5] = 50;
		System.out.println(myIntArray[5]);
		//

		// myIntArray[10] = 5;
		// return ArrayIndexOutOfBoundsException because arrays are zero based

		myIntArray[0] = 5;
		// The first position is 0 and not 1

		// myIntArray = {1,2,3,4};
		// You cannot use to redefine an existing array.

		int[] myIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Define an array and assign values. Java is figures how many element int array

		printArray(myIntArray2);

		// myIntArray.length return length of array
		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i;
		}

		printArray(myIntArray);

		int[] myInteger = getIntegers(5);
		printArray(myInteger);
		System.out.println("The average is : " + getAverage(myInteger));

	}

	public static void printArray(int[] array) {
		for (int item : array) {
			System.out.print(item + ",");
		}
		System.out.println();
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " Integer values.\r");
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		scanner.nextLine();
		return values;
	}

	public static double getAverage(int[] array) {
		int sum = 0;
		int arrayLen = array.length;
		for (int i = 0; i < arrayLen; i++) {
			sum += array[i];
		}
		return sum / (double) arrayLen;
	}

}

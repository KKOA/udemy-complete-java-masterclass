package ch09.challenges;

import java.util.Arrays;
import java.util.Scanner;

class SortArray {
//public static Scanner scanner = new Scanner(System.in);
	public static Scanner scanner;

	public static void main(Scanner input) {
		scanner = input;
		int[] myIntegers = getIntegers(5);
//		int[] myIntegers = { 106, 160, 81, 45, 76 };
		// Only applicable the first time define variable
		int[] myNewInteger = sortIntegers(myIntegers);
		printArray(myNewInteger);

	}

	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values:\r");
		int arrayLen = array.length;
		for (int i = 0; i < arrayLen; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("");
		return array;
	}

	public static void printArray(int[] array) {
		System.out.println("Printing Array");
		int arrayLen = array.length;
		for (int i = 0; i < arrayLen; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
		System.out.println("");
	}

	public static int[] sortIntegers(int[] array) {
		System.out.println("Sorting Array");

		// int[] sortedArray = array;
		/*
		 * Shorthand for int[] sortedArray = new int[array.length]; for(int i=0; i <
		 * array.length; i++) sortedArray[i] = array[i];
		 */
		// Another way
		int[] sortedArray = Arrays.copyOf(array, array.length); // Copy array to another array

		int arrayLen = sortedArray.length;
		for (int i = 0; i < arrayLen; i++) {
			for (int j = i + 1; j < arrayLen; j++) {
				System.out.println(
						sortedArray[i] + " less than " + sortedArray[j] + " : " + (sortedArray[i] < sortedArray[j]));
				if (sortedArray[i] < sortedArray[j]) {
					System.out.println("Swapping " + sortedArray[i] + " " + sortedArray[j]);
					int temp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;
					System.out.println("Swapped " + sortedArray[i] + " " + sortedArray[j]);
					System.out.println();
				}

			}
//			System.out.println();
		}
		// boolean flag = true;
		// int temp;
		// while(flag)
		// {
		// flag = false;
		// for(int i = 0; i < sortedArray.length-1; i++)
		// {
		// if(sortedArray[i] < sortedArray[i+1])
		// {
		// temp = sortedArray[i];
		// sortedArray[i] = sortedArray[i+1];
		// sortedArray[i+1] = temp;
		// flag = true;
		// }
		// }
		// }

		System.out.println("Finshed");
//		System.out.println();
		return sortedArray;
	}

	// All the array elements ar intialized to
	// - Zero for int array
	// - Boolean for false
	// - Null - String or objects
	//
}

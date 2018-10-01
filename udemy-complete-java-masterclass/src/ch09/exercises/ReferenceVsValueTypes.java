package ch09.exercises;

import java.util.Arrays;

public class ReferenceVsValueTypes {
	public static void main() {
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		// Copied value directly to another variable
		// Both variable work independent of one other.

		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);

		anotherIntValue++;

		System.out.println("myIntValue = " + myIntValue);
		System.out.println("anotherIntValue = " + anotherIntValue);

		int[] myIntArray = new int[5];
		// using the 'new' keyboard indicates we are creating an new object
		// Reference holds a reference or address to the object but not the object
		// itself.

		int[] anotherArray = myIntArray;
		// Both hold the same address rather than data itself
		// new indicator for pass by reference

		System.out.println("MyIntArray = " + Arrays.toString(myIntArray));
		System.out.println("AnotherArray = " + Arrays.toString(anotherArray));
		// Collapse array into string use comma as glue between the elements
		anotherArray[0] = 1;
		System.out.println("After change");
		System.out.println("MyIntArray = " + Arrays.toString(myIntArray));
		System.out.println("AnotherArray = " + Arrays.toString(anotherArray));
		// Because both point to the same address in memory, as a result any changes to
		// one effects the other.
		modifyArray(myIntArray);

		System.out.println("MyIntArray = " + Arrays.toString(myIntArray));
		System.out.println("AnotherArray = " + Arrays.toString(anotherArray));

		modifyArray2(myIntArray);

		System.out.println("MyIntArray = " + Arrays.toString(myIntArray));
		System.out.println("AnotherArray = " + Arrays.toString(anotherArray));
		// This is because passing reference to function and not the data itself

		anotherArray = new int[] { 1, 3, 5 };
		// Another Array references a different array
		System.out.println("MyIntArray = " + Arrays.toString(myIntArray));
		System.out.println("AnotherArray = " + Arrays.toString(anotherArray));
	}

	private static void modifyArray(int[] array) {
		array[0] = 2;
	}

	private static void modifyArray2(int[] array) {
		array = new int[] { 1, 2, 3, 4, 5 };
		// Dereference array
	}
}

//kw@m1n@w0rk5

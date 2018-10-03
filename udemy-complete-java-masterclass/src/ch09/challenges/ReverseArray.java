package ch09.challenges;

public class ReverseArray {

	public static void main() {
		// TODO Auto-generated method stub

		int[] myIntegers = { 106, 160, 81, 45, 76 };
		printArray(myIntegers);
		reverse(myIntegers);
		printArray(myIntegers);

	}

	public static void reverse(int[] myArray) {
		// My Solution
		if (myArray.length > 2) {
			int i = 0;
			int j = myArray.length - 1;
			while (j > i) {
				swapElements(i, j, myArray);
				i++;
				j--;
			}
		}

		// Alternative solution
		/*
		 * int myArrayLen = myArray.length; int maxIndex = myArrayLen -1; int halfLength
		 * = myArrayLen / 2; // require to prevent method from reverse array twice
		 * for(int i = 0; i < halfLength; i++) { //divide integer by integer drops any
		 * decimal places //E.g. //5 /2 = 2. .5 is dropped // int temp = myArray[i]; //
		 * myArray[i] = myArray[maxIndex - i]; // myArray[maxIndex - i] = temp;
		 * swapElements(i , maxIndex - i, myArray); }
		 */
	}

	public static void swapElements(int x, int y, int[] myArray) {
		int temp = myArray[x];
		myArray[x] = myArray[y];
		myArray[y] = temp;
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

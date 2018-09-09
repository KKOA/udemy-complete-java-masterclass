package ch04.exercises;

public class BtyeShortInt {

	public static void main() {

		// Each data store value within given range.

		// The data type determines the amount memory allocate to it and their max
		// and min values. Store value out of it's range will return an error

		// byte has a width of 1(8).
		byte myBtyeValue = 10;
		byte minByteValue = -128;
		byte maxByteValue = 127;

		byte myNewByte = (byte) (minByteValue / 2);
		// By default Java convert number expression to use type integer
		// Solution is to explicit cast the value to type

		// Short has a width of 2(16)
		short myShortValue = 356;
		short minShortValue = -32_768; // java equivalent to 32,768
		short maxShortValue = 32_767;
		short myNewShort = (short) (minShortValue / 2);

		// integer has a width of 4(32)
		int myIntValue = 10000;
		int minIntValue = -2_147_483_648;
		// Can use underscore to make number more readable(Java 6+)
		int maxIntValue = 2_147_483_647;

		// long has a width of 8(64)
		long myLongValue = 10000L;
		long minLongValue = -9_223_372_036_854_775_808L;
		// Use capital L at the end of number to tell java we are working long
		// otherwise java will assume number is integer by default
		long maxLongValue = 9_223_372_036_854_775_807L;

	}

}

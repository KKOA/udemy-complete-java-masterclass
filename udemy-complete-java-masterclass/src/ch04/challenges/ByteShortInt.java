package ch04.challenges;

public class ByteShortInt {

	public static void main() {
		System.out.println("ByteShortInt");
		byte anotherBtyeValue = 10;
		short anotherShortValue = 20;
		int anotherIntValue = 50;

		long anotherLongValue = 50_000L + (10 * (anotherBtyeValue + anotherShortValue + anotherIntValue));
		System.out.println("Long total: " + anotherLongValue);
		short shortTotal = (short) (1_000 + (10 * (anotherBtyeValue + anotherShortValue + anotherIntValue)));
		// convert calculation to short
		System.out.println("Short total: " + shortTotal);
		System.out.println();

	}

}

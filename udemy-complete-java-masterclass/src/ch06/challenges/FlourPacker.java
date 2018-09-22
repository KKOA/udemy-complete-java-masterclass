package ch06.challenges;

public class FlourPacker {

	public static final int MIN = 0;
	public static final int bigBagWeight = 5;
	public static final int smallBagWeight = 1;

	public static void main() {

		System.out.println("FlourPacker");
		int bigCount = 1, smallCount = 0, goal = 4;

		System.out
				.println("Can pack bag of " + String.format("%02d", goal) + "kg with " + String.format("%02d", bigCount)
						+ " bag of " + getBigBagWeight() + "kg and " + String.format("%02d", smallCount) + " bag of "
						+ getSmallBagWeight() + " kg : " + canPack(bigCount, smallCount, goal));

		bigCount = 1;
		smallCount = 0;
		goal = 5;

		System.out
				.println("Can pack bag of " + String.format("%02d", goal) + "kg with " + String.format("%02d", bigCount)
						+ " bag of " + getBigBagWeight() + "kg and " + String.format("%02d", smallCount) + " bag of "
						+ getSmallBagWeight() + " kg : " + canPack(bigCount, smallCount, goal));

		bigCount = 0;
		smallCount = 5;
		goal = 4;

		System.out
				.println("Can pack bag of " + String.format("%02d", goal) + "kg with " + String.format("%02d", bigCount)
						+ " bag of " + getBigBagWeight() + "kg and " + String.format("%02d", smallCount) + " bag of "
						+ getSmallBagWeight() + " kg : " + canPack(bigCount, smallCount, goal));

		bigCount = 2;
		smallCount = 2;
		goal = 12;

		System.out
				.println("Can pack bag of " + String.format("%02d", goal) + "kg with " + String.format("%02d", bigCount)
						+ " bag of " + getBigBagWeight() + "kg and " + String.format("%02d", smallCount) + " bag of "
						+ getSmallBagWeight() + " kg : " + canPack(bigCount, smallCount, goal));

		bigCount = -3;
		smallCount = 2;
		goal = 12;

		System.out
				.println("Can pack bag of " + String.format("%02d", goal) + "kg with " + String.format("%02d", bigCount)
						+ " bag of " + getBigBagWeight() + "kg and " + String.format("%02d", smallCount) + " bag of "
						+ getSmallBagWeight() + " kg : " + canPack(bigCount, smallCount, goal));

		bigCount = 2;
		smallCount = 10;
		goal = 18;

		System.out.println("Can pack bag of " + String.format("%02d", goal) + "kg with "
				+ String.format("%02d", bigCount) + " bag of " + FlourPacker.getBigBagWeight() + "kg and "
				+ String.format("%02d", smallCount) + " bag of " + FlourPacker.getSmallBagWeight() + " kg : "
				+ FlourPacker.canPack(bigCount, smallCount, goal));

		bigCount = 0;
		smallCount = 5;
		goal = 6;

		System.out.println("Can pack bag of " + String.format("%02d", goal) + "kg with "
				+ String.format("%02d", bigCount) + " bag of " + FlourPacker.getBigBagWeight() + "kg and "
				+ String.format("%02d", smallCount) + " bag of " + FlourPacker.getSmallBagWeight() + " kg : "
				+ FlourPacker.canPack(bigCount, smallCount, goal));
		System.out.println();

	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		if ((bigCount < MIN) || (smallCount < MIN) || (goal < MIN)) {
			System.out.println("Either bigCount, smallCount or goal is negative");
			return false;
		}

		if (bigCount > 0) {
			int multiple = goal / bigBagWeight;

			if (multiple > bigCount)
				goal = goal - (bigCount * bigBagWeight);
			else
				goal = goal - (multiple * bigBagWeight);
		}

		if (smallCount > 0) {

			int multiple = goal / smallBagWeight;

			if (multiple > smallCount)
				goal = goal - (smallCount * smallBagWeight);
			else
				goal = goal - (multiple * smallBagWeight);
		}

		if (goal == 0)
			return true;

		return false;
	}

	// Getter methods
	public static int getBigBagWeight() {
		return bigBagWeight;
	}

	public static int getSmallBagWeight() {
		return smallBagWeight;
	}
}

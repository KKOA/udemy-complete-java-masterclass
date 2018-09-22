package ch05.challenges;

public class BarkingDog {

	public static void main() {
		System.out.println("Barking Dog");
		System.out.println(BarkingDog.bark(true, 1));
		System.out.println(BarkingDog.bark(false, 2));
		System.out.println(BarkingDog.bark(true, 8));
		System.out.println(BarkingDog.bark(true, -1));
		System.out.println();
	}

	public static boolean bark(boolean barking, int hour) {
		if (hour < 0 || hour > 23)
			return false;
		if (barking && (hour < 8 || hour == 23))
			return true;
		return false;

	}
}

package ch08.challenges;

public class RoomMain {
	public static void main() {
		// Bedroom
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("North");
		Wall wall3 = new Wall("East");
		Wall wall4 = new Wall("South");

		Ceiling ceiling = new Ceiling(12, 55);

		Bed bed = new Bed("Modern", 4, 3, 2, 1);

		Lamp lamp = new Lamp("Classic", false, 75);

		Bedroom bedroom = new Bedroom("Keith", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();
		System.out.println();
	}

}

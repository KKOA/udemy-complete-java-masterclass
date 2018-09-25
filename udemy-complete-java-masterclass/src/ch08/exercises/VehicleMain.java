package ch08.exercises;

public class VehicleMain {
	public static void main() {
		Car car1 = new Car("porsche 911", 3, 500);
		System.out.println(car1.getName() + " with " + car1.getDoors() + " doors and " + car1.getEngineCapacity()
				+ " Engine Capcity.");
		System.out.println();
	}
}

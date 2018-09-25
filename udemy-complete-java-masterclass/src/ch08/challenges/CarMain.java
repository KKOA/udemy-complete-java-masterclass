package ch08.challenges;

public class CarMain {

	public static void main() {
		Car car1 = new Car("Base Car", 5);
		System.out.println(car1.startEngine());
		System.out.println(car1.accelerate());
		System.out.println(car1.brake());
		System.out.println();

		BMW car2 = new BMW("X4", 6);
		System.out.println(car2.startEngine());
		System.out.println(car2.accelerate());
		System.out.println(car2.brake());
		System.out.println();

		Elva car3 = new Elva("FJ200", 10);
		System.out.println(car3.startEngine());
		System.out.println(car3.accelerate());
		System.out.println(car3.brake());
		System.out.println();

		Fiat car4 = new Fiat("Panda", 5);
		System.out.println(car4.startEngine());
		System.out.println(car4.accelerate());
		System.out.println(car4.brake());
		System.out.println();

	}

}

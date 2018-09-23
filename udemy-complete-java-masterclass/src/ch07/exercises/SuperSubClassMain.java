package ch07.exercises;

public class SuperSubClassMain {
	public static void main() {

		SubClass sub = new SubClass();
		System.out.println(sub.getClass().getSimpleName());
		sub.printMethod();
		System.out.println();
	}
}

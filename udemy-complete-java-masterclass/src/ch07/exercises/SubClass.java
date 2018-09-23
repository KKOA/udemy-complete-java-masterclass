package ch07.exercises;

public class SubClass extends SuperClass {

	@Override
	public void printMethod() {
		super.printMethod();
		// Without super this would be never ending recursive method as no exit
		// condition
		System.out.println("Printed in SubClass.");

	}
}

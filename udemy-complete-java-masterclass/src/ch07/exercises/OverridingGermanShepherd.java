package ch07.exercises;

public class OverridingGermanShepherd extends OverLoadingDog {
	/*
	 * overriding defininf a method in child class that already exists in parent
	 * class with the same signature(same name,same parameters) The Method is also
	 * knonw as Runtime Polymorphism or Dynamic Method Dispatch
	 */

	/*
	 * Adding the annotation @overide immediately above method. The compile reads
	 * and will then show an error if not following the overriding rules correctly.
	 * 
	 * Rules - Must have same signature as parent method - The method must exist in
	 * parent - return type can be a subclass of the return type in parent class -
	 * accessor modifier cannot be lower ->E.g. parent method is protected, the
	 * child must be protected or public but not private - Constructors cannot
	 * overridden - Private, final and static methods cannot overridden. - Must not
	 * throw a new or broader checked execption
	 */

	@Override
	public void bark() {
		System.out.println("Woof Woof Woof");
	}
}

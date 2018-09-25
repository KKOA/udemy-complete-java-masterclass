package ch07.challenges;

//Inherit from Car
public class Outlander extends Car {
	// fields
	private int roadServiceMonths;

	// Constructor
	public Outlander(int roadServiceMonths) {
		super("Outlander", "4WD", 5, 5, 6, false); // Call car constructor with arguments
		this.roadServiceMonths = roadServiceMonths;
	}

	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;

		if (newVelocity > 0) {
			if (newVelocity > 60)
				changeCurrentGear(6); // Call Car changeCurrentGear method
			else if (newVelocity > 50)
				changeCurrentGear(5);
			else if (newVelocity > 40)
				changeCurrentGear(4);
			else if (newVelocity > 30)
				changeCurrentGear(3);
			else if (newVelocity > 20)
				changeCurrentGear(2);
			else if (newVelocity > 10)
				changeCurrentGear(1);

			changeVelocity(newVelocity, getCurrentDirection()); // call Car changeVelocity method

		} else {
			stop(); // Call Vechile stop method
			changeCurrentGear(1); // Call changeCurrentGear stop method
		}
	}

	// Getter and setter
	public int getRoadServiceMonths() {
		return this.roadServiceMonths;
	}
}

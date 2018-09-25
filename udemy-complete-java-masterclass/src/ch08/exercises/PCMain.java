package ch08.exercises;

public class PCMain {
	public static void main() {
		Dimensions myDimensions = new Dimensions(24, 28, 10);
		Case myCase = new Case("220B", "Dell", "240", myDimensions);

		// Resolution myResolution = new Resolution(1080, 800);
		// Monitor myMonitor = new Monitor("27inch Beaste", "Acer", 27, myResolution);
		// Alternative with anonymus instance as parameter
		Monitor myMonitor = new Monitor("27inch Beaste", "Acer", 27, new Resolution(2540, 1440));

		MotherBoard myMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

		PC myPC = new PC(myCase, myMonitor, myMotherBoard);

		// myPC.getTheMonitor().drawPixelAt(20, 60, "red");
		// myPC.getTheMonitor() return instance of Monitor
		// drawPixelAt is an instance method of Monitor
		// myPC.getTheMotherBoard().loadProgram("window 1.0");
		// myPc.getTheCase().pressPowerButton();

		myPC.powerUp();
		System.out.println();
	}
}

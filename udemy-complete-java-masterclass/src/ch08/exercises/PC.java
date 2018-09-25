package ch08.exercises;

public class PC {
	// fields
	private Case theCase;
	private Monitor theMonitor;
	private MotherBoard theMotherBoard;

	// Constructor
	public PC(Case theCase, Monitor theMonitor, MotherBoard theMotherBoard) {
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherBoard = theMotherBoard;
	}

	public void powerUp() {
		getTheCase().pressPowerButton();
		drawLogo();
	}

	public void drawLogo() {
		getTheMonitor().drawPixelAt(1200, 50, "yellow");
	}

	// Getter
	private Case getTheCase() {
		return this.theCase;
	}

	private Monitor getTheMonitor() {
		return this.theMonitor;
	}

	private MotherBoard getTheMotherBoard() {
		return this.theMotherBoard;
	}
}

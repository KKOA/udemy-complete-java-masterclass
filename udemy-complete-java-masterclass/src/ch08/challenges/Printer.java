package ch08.challenges;

public class Printer {
	// fields
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	private static final int MAX_TONNER_LEVEL = 100;
	private static final int MIN_TONNER_LEVEL = 0;

	// constructor
	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel >= MIN_TONNER_LEVEL && tonerLevel <= MAX_TONNER_LEVEL)
			this.tonerLevel = tonerLevel;
		else
			this.tonerLevel = -1;

		this.pagesPrinted = 0;
		this.duplex = duplex;
	}

	public int fillUpToner(int amount) {
		if ((amount >= MIN_TONNER_LEVEL) && (amount <= MAX_TONNER_LEVEL)) {
			if (this.tonerLevel + amount < MAX_TONNER_LEVEL) {
				this.tonerLevel += amount;
				return this.tonerLevel;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	public int printPages(int pages) {
		int pageToPrint = pages;
		if (this.duplex) {
			pageToPrint = (pageToPrint / 2) + (pages % 2);
			System.out.println("Printing in duplex mode");
		} else {
			System.out.println("Not printing in duplex mode");
		}
		this.pagesPrinted += pageToPrint;
		return pageToPrint;
	}

	// Getters
	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public boolean isDuplex() {
		return duplex;
	}

}

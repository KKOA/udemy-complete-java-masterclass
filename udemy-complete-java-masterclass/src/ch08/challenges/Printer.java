package ch08.challenges;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel < -1 && tonerLevel <= 100)
			this.tonerLevel = tonerLevel;
		else
			this.tonerLevel = -1;

		this.pagesPrinted = 0;
		this.duplex = duplex;
	}

	public int fillUpToner(int amount) {
		if ((amount >= 0) && (amount <= 100)) {
			if (this.tonerLevel + amount < 100) {
				this.tonerLevel += amount;
				return this.tonerLevel;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	public int pritnPages(int pages) {
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

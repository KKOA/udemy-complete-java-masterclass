package ch08.challenges;

class Bed {

	// fields
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilt;

	// constructor
	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}

	public void make() {
		System.out.println("Bed - > Making");
	}

	// Getters
	public String getStyle() {
		return this.style;
	}

	public int getPillows() {
		return this.pillows;
	}

	public int getHeight() {
		return this.height;
	}

	public int getSheets() {
		return this.sheets;
	}

	public int get() {
		return this.quilt;
	}
}

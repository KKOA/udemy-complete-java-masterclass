package ch07.exercises;

public class House {

	private String color;

	public House(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		// this is required, same parameter name as field
	}

}

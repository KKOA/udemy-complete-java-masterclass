package ch07.challenges;

public class VechileMain {
	public static void main() {
		Outlander outlander = new Outlander(36);
		outlander.accelerate(30);
		outlander.steer(45);
		outlander.accelerate(20);
		outlander.steer(-45);
		outlander.accelerate(-50);

	}
}

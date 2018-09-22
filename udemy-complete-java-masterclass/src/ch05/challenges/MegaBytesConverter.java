package ch05.challenges;

public class MegaBytesConverter {

	public static void main() {
		System.out.println("MegaBytesConverter");
		MegaBytesConverter.printMegaBytesAndKiloBytes(2050);
		MegaBytesConverter.printMegaBytesAndKiloBytes(-20);
		System.out.println();
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if (kiloBytes < 0) {
			System.out.println(kiloBytes + " is an invalid value.");
		} else {
			int megaBytes = kiloBytes / 1024;
			int kiloBytesLeft = kiloBytes % 1024;
			System.out.println("" + kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesLeft + " KB");
		}
	}
}

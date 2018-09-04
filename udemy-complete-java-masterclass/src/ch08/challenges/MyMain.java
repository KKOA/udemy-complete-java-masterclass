package ch08.challenges;

public class MyMain {
	public static void main() {

		System.out.println("Chaper 8 Challenges");
		System.out.println();

		System.out.println("Printer 1");
		Printer printer = new Printer(50, true);
		System.out.println("Intial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.pritnPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer "
				+ printer.getPagesPrinted());
		pagesPrinted = printer.pritnPages(3);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer "
				+ printer.getPagesPrinted());
		System.out.println();

		System.out.println("Printer 2");
		Printer printer2 = new Printer(50, false);
		System.out.println("Intial page count = " + printer2.getPagesPrinted());
		int pagesPrinted2 = printer2.pritnPages(4);
		System.out.println("Pages printed was " + pagesPrinted2 + " new total print count for printer "
				+ printer2.getPagesPrinted());
		pagesPrinted2 = printer2.pritnPages(3);
		System.out.println("Pages printed was " + pagesPrinted2 + " new total print count for printer "
				+ printer2.getPagesPrinted());

		System.out.println();
		System.out.println("End of Chaper 8 Challenges");
		System.out.println();
	}

}

package ch06.challenges;

class EvenNumbers {
	public static void main() {

		int evenTotal = 0;
		int evenNumbersFound = 0;
		int number = 4, finishNumber = 20;
		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			System.out.println(number + " is an even number.");
			evenNumbersFound++;
			if (evenNumbersFound == 5)
				break;
			evenTotal += number;
		}
		System.out.println("Total:" + evenTotal);

	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}

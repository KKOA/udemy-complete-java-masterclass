package ch04.challenges;

public class Operator {
	public static void main() {
		System.out.println("Operator");
		double firstValue = 20d, secondValue = 80d;
		System.out.println("FirstValue : " + firstValue);
		System.out.println("SecondValue : " + secondValue);
		double thirdValue = (firstValue + secondValue) * 25;
		System.out.println("ThirdValue : " + thirdValue);
		double fourthValue = thirdValue % 40;
		System.out.println("FourthValue : " + fourthValue);
		if (fourthValue <= 20) {
			System.out.println("Total was over the limit");
		}
		System.out.println();
	}
}

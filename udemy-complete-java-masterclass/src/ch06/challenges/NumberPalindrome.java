package ch06.challenges;

public class NumberPalindrome {

	public static void main() {
		System.out.println("NumberPalindrome");
		int number = -222;
		System.out.println(number + " is a Palindrome : " + NumberPalindrome.isPalindrome(number));
		number = 110;
		System.out.println(number + " is a Palindrome : " + NumberPalindrome.isPalindrome(number));
		number = 9009;
		System.out.println(number + " is a Palindrome : " + NumberPalindrome.isPalindrome(number));
		number = 73537;
		System.out.println(number + " is a Palindrome : " + NumberPalindrome.isPalindrome(number));
		number = 6;
		System.out.println(number + " is a Palindrome : " + NumberPalindrome.isPalindrome(number));
		number = 12;
		System.out.println(number + " is a Palindrome : " + NumberPalindrome.isPalindrome(number));
		System.out.println();
	}

	public static boolean isPalindrome(int number) {
		String original = String.valueOf(Math.abs(number));
		String reverse = reverseString(original);
		return original.equals(reverse);
	}

	public static String reverseString(String original) {
		String reverse = "";
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		return reverse;
	}

	// Another solutions
	public static boolean isPalindrome2(int number) {
		int parameter = number;
		int reverse = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			reverse *= 10;
			reverse += lastDigit;
			number /= 10;
			System.out.println("reverse: " + parameter);
			System.out.println("reverse: " + reverse);
			System.out.println("number: " + number);
			System.out.println();
		}
		return reverse == parameter;
	}
}

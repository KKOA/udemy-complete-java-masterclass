package ch05.challenges;

//import ch05.exercises.IfElseIfElse;

//public class MyMain {
public class Ch05Challenges {

	public static void main() {
		System.out.println("Chapter 5 Challenges");
		System.out.println();

		IfElseIfElse.main();
		MoreMethod.main();

		System.out.println();
		System.out.println("MegaBytesConverter");
		MegaBytesConverter.printMegaBytesAndKiloBytes(2050);
		MegaBytesConverter.printMegaBytesAndKiloBytes(-20);

		System.out.println();
		System.out.println("Barking Dog");
		System.out.println(BarkingDog.bark(true, 1));
		System.out.println(BarkingDog.bark(false, 2));
		System.out.println(BarkingDog.bark(true, 8));
		System.out.println(BarkingDog.bark(true, -1));

		System.out.println();
		System.out.println("LeapYear");
		System.out.println(LeapYear.isLeapYear(-1600));
		System.out.println(LeapYear.isLeapYear(1600));
		System.out.println(LeapYear.isLeapYear(2017));
		System.out.println(LeapYear.isLeapYear(2000));

		System.out.println();
		System.out.println("DecimalComparator");
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

		System.out.println();
		System.out.println("EqualSumChecker");
		System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
		System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
		System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));

		System.out.println();
		System.out.println("TeenNumberChecker");
		System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
		System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
		System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));

		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, 0);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(7, 5);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(-1, -1);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(-1, 1);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(0, 1);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, -10);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, -13);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(6, 0);

		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(100);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(156);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(157);
		FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(-10);

		System.out.println(SecondsAndMinutes.getDurationString(100, 58));
		System.out.println(SecondsAndMinutes.getDurationString(100, 300));
		System.out.println(SecondsAndMinutes.getDurationString(0, 20));
		System.out.println(SecondsAndMinutes.getDurationString(-30, 20));
		System.out.println(SecondsAndMinutes.getDurationString(66));
		System.out.println(SecondsAndMinutes.getDurationString(-58));

		System.out.println(AreaCalculator.area(5.0));
		System.out.println(AreaCalculator.area(-1));
		System.out.println(AreaCalculator.area(5.0, 4.0));
		System.out.println(AreaCalculator.area(-1.0, 4.0));

		System.out.println(AreaCalculator.area(5.0));
		System.out.println(AreaCalculator.area(-1));
		System.out.println(AreaCalculator.area(5.0, 4.0));
		System.out.println(AreaCalculator.area(-1.0, 4.0));

		MinutesToYearsDaysCalculator.printYearsAndDays(525600);
		MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
		MinutesToYearsDaysCalculator.printYearsAndDays(561600);

		IntEqualityPrinter.printEqual(1, 1, 1);
		IntEqualityPrinter.printEqual(1, 1, 2);
		IntEqualityPrinter.printEqual(-1, -1, -1);
		IntEqualityPrinter.printEqual(1, 2, 3);

		System.out.println(PlayingCat.isCatPlaying(true, 25));
		System.out.println(PlayingCat.isCatPlaying(true, 10));
		System.out.println(PlayingCat.isCatPlaying(true, 45));
		System.out.println(PlayingCat.isCatPlaying(true, 36));

		System.out.println(PlayingCat.isCatPlaying(false, 25));
		System.out.println(PlayingCat.isCatPlaying(false, 36));
		System.out.println(PlayingCat.isCatPlaying(false, 35));
		System.out.println(PlayingCat.isCatPlaying(false, 30));

		System.out.println();
		System.out.println("End of Chapter 5 Challenges");
		System.out.println();
	}

}

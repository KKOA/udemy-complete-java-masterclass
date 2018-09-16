package ch05.challenges;

/*
 * Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return ÅgInvalid valueÅh in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format ÅgXXh YYm ZZsÅh where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return ÅgInvalid valueÅh if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.

Tips: 
	Use int or long for your number data types is probably a good idea.
	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	Methods should be static as we have used previously.

Bonus: 
	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	Create a new console project and call it SecondsAndMinutesChallenge

 */

public class SecondsAndMinutes {
	private static final int SECONDS_IN_MINUTE = 60;
	private static final int MINUTES_IN_HOUR = 60;
	private static final int MIN = 0;

	public static String getDurationString(int minutes, int seconds) {
		if ((minutes < MIN) || (seconds < MIN || seconds >= SECONDS_IN_MINUTE)) {
			return "Invalid minutes or seconds (" + minutes + " minutes, " + seconds + " seconds)";
		}

		System.out.print(minutes + " minutes and " + seconds + " seconds is : ");
		int hours = minutes / MINUTES_IN_HOUR;
		minutes = minutes % MINUTES_IN_HOUR;
		return String.format("%02dh %02dm %02ds", hours, minutes, seconds);

	}

	public static String getDurationString(int seconds) {
		if (seconds < MIN) {
			return String.format("Invalid seconds (%02ds)", seconds);
		}
		int minutes = seconds / SECONDS_IN_MINUTE;
		seconds %= SECONDS_IN_MINUTE;
		return getDurationString(minutes, seconds);
	}
}

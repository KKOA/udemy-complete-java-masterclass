package ch06.exercises;

public class Switch {
	public static void main() {
		System.out.println("Switch");
		int value = 1;
		if (value == 1)
			System.out.println("Value was 1");
		else if (value == 2)
			System.out.println("Value was 2");
		else
			System.out.println("Value was 3");

		int switchValue = value;
		switch (switchValue)
		// test this value against case
		{
		case 1:
			System.out.println("Value was 1");
			break;// escape switch if condition met
		case 2:
			System.out.println("Value was 2");
			break;
		case 3:
		case 4:
			// equivalent if( value == 3 || value == 4)
			System.out.println("Value was 3 or 4");
			break;
		case 5:
			System.out.println("Value was 5");
			// Without break all the following case content are executed until reaches
			// another break or the end of the switch
		default:
			// Equivalent else in if/else statement
			System.out.println("Value was 3");
			break; // optional
		}

		String month = "Oct";
		switch (month) {
		case "Jan": // case sensitive
			System.out.println("January");
			break;
		case "Feb":
			System.out.println("February");
			break;
		case "Mar":
			System.out.println("March");
			break;
		case "Apr":
			System.out.println("April");
			break;
		case "May":
			System.out.println("May");
			break;
		case "Jun":
			System.out.println("June");
			break;
		case "Jul":
			System.out.println("July");
			break;
		case "Aug":
			System.out.println("August");
			break;
		case "Sep":
			System.out.println("September");
			break;
		case "Oct":
			System.out.println("October");
			break;
		case "Nov":
			System.out.println("November");
			break;
		case "Dec":
			System.out.println("December");
			break;
		default:
			System.out.println("Not a month");
			break;
		}
		System.out.println();

	}

}

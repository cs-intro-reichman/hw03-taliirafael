/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month <= 12; month++) {
			int days = nDaysInMonth(month, year);
			System.out.println("Month " + month + " has " + days + " days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    if (year % 100 != 0 || year % 400 == 0) {
			return true;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.

				// 31 = jan, march, may, july, august, october, december
			// 30 = april 4, june 6, september 9, november 11
			// 28 and 29 = feb
	public static int nDaysInMonth(int month, int year) {
		int days;
		switch (month) {
			case 1: days = 31;
			break;
			case 2: days = (isLeapYear(year)) ? 29 : 28;;
			break;
			case 3: days = 31;
			break;
			case 4: days = 30;
			break;
			case 5: days = 31;
			break;
			case 6: days = 30;
			break;
			case 7: days = 31;
			break;
			case 8: days = 31;
			break;
			case 9: days = 30;
			break;
			case 10: days = 31;
			break;
			case 11: days = 30;
			break;
			case 12: days = 31;
			break;
			default: days = 31;
		}
		return days;
	}
}

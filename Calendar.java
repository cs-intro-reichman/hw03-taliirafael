/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 1;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sundayCounter;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	public static void main(String args[]) {
		while (year <= 2000) {
			String sundayPrinter = "";
			if (dayOfWeek == 7) {
				sundayPrinter = " Sunday";
				sundayCounter++;
                System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			} else {
                System.out.println(dayOfMonth + "/" + month + "/" + year);
            }
			advance();
		}
        System.out.println("During the 20th century, 172 Sunday fell on the first day of the month");
	}
		//int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	//while (true) {
	 		//// Write the body of the while 		
	 	//	advance();
	 	//	debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		//if (false) { 
	 		//	break;
	 	//// Write the necessary ending code here
	 
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// Replace this comment with your code
		dayOfWeek++;
		dayOfMonth++;
		if (dayOfMonth > nDaysInMonth) {
			dayOfMonth = 1;
			month++;

			if (month > 12) {
				year++;
				month = 1;
			}
		}
      
        if (dayOfWeek > 7) {
            dayOfWeek = 1;
            sundayCounter++;
        }
		nDaysInMonth = nDaysInMonth(month, year);
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
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
	



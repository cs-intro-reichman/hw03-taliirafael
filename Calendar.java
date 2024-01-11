public class Calendar { 
// Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;   
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 1;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January
    
    /** 
     * Prints the calendars of all the years in the 20th century. Also prints the  
     * number of Sundays that occured on the first day of the month during this period.
     */
    public static void main(String args[]) {
    
    int finalYear = Integer.parseInt(args[0]);

        while (year < finalYear + 1) {
                    if (year == finalYear) {
            String sundayPrinter = "";
            if (dayOfWeek % 7 == 0) {
                sundayPrinter = " Sunday";
            }

            System.out.println(dayOfMonth + "/" + month + "/" + year + sundayPrinter);
        }
                advance();
    }
        //// Write the necessary ending code here
        }
    
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
            nDaysInMonth = nDaysInMonth(month, year);
        } 
                
    // Returns true if the given year is a leap year, false otherwise.
    public static boolean isLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return true;
            }
            return false;
    }
        
    // Returns the number of days in the given month and year.
    // April, June, September, and November have 30 days each.
    // February has 28 days in a common year, and 29 days in a leap year.
    // All the other months have 31 days.
    public static int nDaysInMonth(int month, int year) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 30;
            }
            else if (month == 2 && isLeapYear(year)){
                    return 29;
            }
            else if (month == 2 && !isLeapYear(year)) {
                    return 28;
            }
            else {
                    return 31;
            }
    }    
}

package week_06.assignments;

public class Question_06_33 {
    public static void main(String[] args) {
        printDateAndTime();
    }

    public static void printDateAndTime() {
        int day = getTime("day");
        int month = getTime("month");
        int year = getTime("year");
        int hour = getTime("hour");
        int minute = getTime("minute");
        int second = getTime("second");
        String stringOfMonth = getMontName(month);

        System.out.printf("Current date and time is %s %d, %d %d:%d:%d",
                stringOfMonth, day, year, hour, minute, second);

    }

    public static int getTime(String dateOrTime) {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long totalDays = totalHours / 24;

        int currentDay = getDate("day", totalDays);
        int currentMonth = getDate("month", totalDays);
        int currentYear = getDate("year", totalDays);

        switch (dateOrTime) {
            case "day":
                return currentDay;
            case "month":
                return currentMonth;
            case "year":
                return currentYear;
            case "hour":
                return (int) currentHours;
            case "minute":
                return (int) currentMinutes;
            case "second":
                return (int) currentSeconds;
            default:
                return 0;
        }
    }

    public static int getDate(String date, long totalDays) {
        //total days is the days between today and 1970 January 1
        //because of System.currentTimeMillis() method ...

        int currentYear = 1970;
        int currentMonth = 1;
        int currentDay = 1;

        while (totalDays > 365) {
            if (isLeapYear(currentYear)) {
                totalDays -= 366;
            } else {
                totalDays -= 365;
            }
            currentYear++;
        }
        while (totalDays > 31) {
            if ((currentMonth == 1)
                    || (currentMonth == 3)
                    || (currentMonth == 5)
                    || (currentMonth == 7)
                    || (currentMonth == 8)
                    || (currentMonth == 10)
                    || (currentMonth == 12)) {
                totalDays -= 31;
            } else if (currentMonth == 4
                    || currentMonth == 6
                    || currentMonth == 9
                    || currentMonth == 11) {
                totalDays -= 30;
            } else {
                if (isLeapYear(currentYear)) {
                    totalDays -= 29;
                } else {
                    totalDays -= 28;
                }
            }
            currentMonth++;
        }
        currentDay += (int) totalDays;
        switch (date) {
            case "day":
                return currentDay;
            case "month":
                return currentMonth;
            case "year":
                return currentYear;
            default:
                return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static String getMontName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Wrong";
        }
    }

}

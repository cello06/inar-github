package week_06.assignments;

import java.util.Locale;

public class Question_06_24 {
    public static void main(String[] args) {
        printCurrentDateAndTime();
    }

    public static void printCurrentDateAndTime() {
        printCurrentTime();
        printCurrentDate();
    }

    public static void printCurrentTime() {
        int currentHour = getTimeAndDate("hour") + 3;//For Turkey..
        int currentMinute = getTimeAndDate("minute");
        int currentSecond = getTimeAndDate("second");
        String aMOrPm = "";

        if (currentHour >= 12) {
            aMOrPm = "PM";
            currentHour = currentHour % 12;
        } else {
            aMOrPm = "AM";
        }
        System.out.printf("%d : %d : %d %s ", currentHour, currentMinute, currentSecond, aMOrPm);


    }

    public static void printCurrentDate() {
        int currentDay = getTimeAndDate("day");
        int currentMonth = getTimeAndDate("month");
        int currentYear = getTimeAndDate("year");

        System.out.printf(" %d / %d / %d", currentMonth, currentDay, currentYear);
    }

    public static int getTimeAndDate(String timeDate) {
        //System.currentTimeMillis() method brings total
        //millis seconds from 1 january 1970 .By Using that
        //we can find both date and time.

        long totalMillisSecond = System.currentTimeMillis();
        long totalSeconds = totalMillisSecond / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long totalDays = totalHours / 24;

        int currentDays = getDate("day", totalDays);
        int currentMonths = getDate("month", totalDays);
        int currentYears = getDate("year", totalDays);

        timeDate = timeDate.toLowerCase(Locale.ROOT);

        switch (timeDate) {
            case "second":
                return (int) currentSeconds;
            case "minute":
                return (int) currentMinutes;
            case "hour":
                return (int) currentHours;
            case "day":
                return currentDays;
            case "month":
                return currentMonths;
            case "year":
                return currentYears;
            default:
                System.out.println("Sth Wrong Happened !");
                return 0;
        }
    }

    public static int getDate(String date, long totalDays) {
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

        while ((totalDays > 31)) {
            if (currentMonth == 1 || currentMonth == 3 || currentMonth == 5
                    || currentMonth == 7 || currentMonth == 8 || currentMonth == 10
                    || currentMonth == 12) {
                totalDays -= 31;
            } else if (currentMonth == 4 || currentMonth == 6 || currentMonth == 9
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
        currentDay = (int) totalDays;

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

}

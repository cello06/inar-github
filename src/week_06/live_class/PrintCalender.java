package week_06.live_class;

import java.util.Scanner;

public class PrintCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g.,2012) : ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12 : ");
        int month = input.nextInt();
        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        printTitle(year, month);
        printBody(year, month);
    }


    private static void printTitle(int year, int month) {
        String nameOfMonth = getNameOfMonth(month);
        System.out.println("       " + nameOfMonth + " " + year);
        System.out.println("------------------------------------");
        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    }

    private static String getNameOfMonth(int month) {
        String result = "";
        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Wrong number for month!";
        }
        return result;
    }

    public static void printBody(int year, int month) {
        int startDayOfMonth = getStartDay(year, month);
        for (int i = 0; i < startDayOfMonth; i++) {
            System.out.printf("%4s", " ");
        }
        for (int i = 1; i < getNumberOfDayInMonth(year, month); i++) {
            if (((i-1) + startDayOfMonth) % 7 == 0) {
                System.out.printf("\n%4d", i);
            } else {
                System.out.printf("%4d", i);
            }
        }
    }

    public static int getStartDay(int year, int month) {
        int startDayOfMonth = getTotalDays(year, month) % 7;
        return startDayOfMonth;
    }

    public static int getTotalDays(int year, int month) {
        final int START_DAY_OF_JAN_1_1800 = 3;
        int totalDays = START_DAY_OF_JAN_1_1800;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            totalDays += getNumberOfDayInMonth(year,i);
        }
        return totalDays;
    }

    public static int getNumberOfDayInMonth(int year, int month) {
        int numberOfDay = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            numberOfDay = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numberOfDay = 30;
        } else {
            if (isLeapYear(year)) {
                numberOfDay = 29;
            } else {
                numberOfDay = 28;
            }
        }
        return numberOfDay;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

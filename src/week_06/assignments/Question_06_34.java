package week_06.assignments;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12 :");
        int month = input.nextInt();

        int dayOfWeek = getDayOfWeek(year, month);
        printCalendar(year, month, dayOfWeek);
    }

    public static int getDayOfWeek(int year, int month) {
        int dayOfWeek = 0;
        int dayOfMonth = 1;
        int century = year / 100;
        int yearOfCentury = year % 100;

        if (month == 1) {
            month = 13;
            year++;
            yearOfCentury--;

        }
        if (month == 2) {
            month = 14;
            year++;
            yearOfCentury--;
        }


        dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury +
                (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;

        return dayOfWeek;
    }

    public static void printCalendar(int year, int month, int dayOfWeek) {
        String nameOfMonth = getNameOfMonth(month);
        int dayOfMonth = getDayOfMonth(month, year);


        System.out.println("          " + nameOfMonth + "    " + year);
        System.out.println("------------------------------------------------");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        if (dayOfWeek == 0) {//To print properly I need to change it if it is zero to seven
            dayOfWeek = 7;
        }
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.printf("%-5s", " ");
        }

        for (int i = 1; i <= dayOfMonth; i++) {
            if (dayOfWeek % 7 == 0) {
                System.out.printf("%-5d\n", i);
            } else {
                System.out.printf("%-5d", i);
            }
            dayOfWeek++;
        }
    }

    public static String getNameOfMonth(int month) {
        switch (month) {
            case 1:
                return "Januaray";
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

    public static int getDayOfMonth(int month, int year) {
        if (month == 1
                || month == 3
                || month == 5
                || month == 7
                || month == 8
                || month == 10
                || month == 12) {
            return 31;
        } else if (month == 4
                || month == 6
                || month == 9
                || month == 11) {
            return 30;
        } else {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
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

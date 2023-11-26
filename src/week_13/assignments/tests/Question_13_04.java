package week_13.assignments.tests;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question_13_04 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong input!\n" +
                    "Usage : java Question_13_04.java month year");
            System.exit(1);
        }
        try {
            int month = Integer.parseInt(args[0]) - 1;
            int year = Integer.parseInt(args[1]);
            final int FIRST_DAY_IN_MONTH = 1;

            Calendar calendar = new GregorianCalendar(year, month, FIRST_DAY_IN_MONTH);
            printCalendar(calendar);

        } catch (NumberFormatException ex) {
            System.out.println("Wrong value for month or year\n" +
                    "You must enter integer!");
        }
    }

    public static void printCalendar(Calendar calendar) {
        printAbovePart(calendar);
        printBelowPart(calendar);
    }

    public static void printAbovePart(Calendar calendar) {
        System.out.println("         " + getNameOfMonth(calendar.get(Calendar.MONTH)) + " "
                + calendar.get(Calendar.YEAR));
        System.out.println("----------------------------------");
        System.out.printf("%-4s%-4s%-4s%-4s%-4s%-4s%-4s",
                "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat\n");
    }

    public static void printBelowPart(Calendar calendar) {

        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);
        //firstly put spaces if there is
        for (int i = 1; i < firstDayOfMonth; i++) {
            System.out.printf("%4s", " ");
        }
        //then put the numbers
        for (int i = 1; i <= maxDayOfMonth; i++) {
            if ((firstDayOfMonth + (i - 1)) % 7 == 0) {
                System.out.printf("%-4d\n", i);
            } else {
                System.out.printf("%-4d", i);
            }
        }
    }

    public static String getNameOfMonth(int month) {
        switch (month) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                System.out.println("Sth Wrong happen!!!");
                System.exit(2);
                return null;
        }
    }
}

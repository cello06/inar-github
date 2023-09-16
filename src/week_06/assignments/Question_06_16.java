package week_06.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        printYears();
    }

    public static void printYears() {
        System.out.println("Year   Days in year");
        System.out.println("----------------------");

        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-10d%-10d\n", i, numberOfDaysInYear(i));
        }
    }

    public static int numberOfDaysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
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

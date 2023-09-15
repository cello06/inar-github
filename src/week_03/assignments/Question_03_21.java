package week_03.assignments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g.,2012) : ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: ");
        int dayOfMonth = input.nextInt();
        int century = (year / 100);
        int yearOfCentury = year % 100;
        if (month == 1) {
            year = year - 1;
            month = 13;
            yearOfCentury--;
        }
        if (month == 2) {
            year = year - 1;
            month = 14;
            yearOfCentury--;
        }
        int dayOfWeek = ((dayOfMonth) + ((26 * (month + 1)) / 10) + (yearOfCentury)
                + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
        String nameOfDay = "";
        switch (dayOfWeek) {
            case 0:
                nameOfDay = "Saturday";
                break;
            case 1:
                nameOfDay = "Sunday";
                break;
            case 2:
                nameOfDay = "Monday";
                break;
            case 3:
                nameOfDay = "Tuesday";
                break;
            case 4:
                nameOfDay = "Wednesday";
                break;
            case 5:
                nameOfDay = "Thursday";
                break;
            case 6:
                nameOfDay = "Friday";
                break;
            default:
                System.out.println("Sth wrong happen!");

        }
        System.out.println("Day of the week is " + nameOfDay);

    }
}

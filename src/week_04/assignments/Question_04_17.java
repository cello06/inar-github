package week_04.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {

        int numberOfDays = 30;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");

        int year = input.nextInt();

        System.out.print("Enter a month : ");

        String month = input.next();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        switch (month) {
            case "Jan":
                numberOfDays = 31;
                break;
            case "Feb":
                numberOfDays = (isLeapYear) ? 29 : 28;
                break;
            case "Mar":
                numberOfDays = 31;
                break;
            case "Apr":
                numberOfDays = 30;
                break;
            case "May":
                numberOfDays = 31;
                break;
            case "Jun":
                numberOfDays = 30;
                break;
            case "Jul":
                numberOfDays = 31;
                break;
            case "Agu":
                numberOfDays = 31;
                break;
            case "Sep":
                numberOfDays = 30;
                break;
            case "Oct":
                numberOfDays = 31;
                break;
            case "Nov":
                numberOfDays = 30;
                break;
            case "Dec":
                numberOfDays = 31;
                break;
            default:
                System.out.println("invalid input!");
        }

        System.out.printf("%s %d has %d days", month, year, numberOfDays);

    }
}

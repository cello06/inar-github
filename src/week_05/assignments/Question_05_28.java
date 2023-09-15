package week_05.assignments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isLeapYear = false;

        System.out.print("Enter year : (e.g.,2012) : ");

        int year = input.nextInt();

        System.out.print("Enter first day of the year : ");

        int firstDayOfYear = input.nextInt();


        int dayOfMonth = 0;

        String nameOfDay = "";

        String nameOfMonth = "";


        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

            isLeapYear = true;

        }


        for (int month = 1; month <= 12; month++) {


            switch (month) {
                case 1:
                    nameOfMonth = "January";
                    break;
                case 2:
                    nameOfMonth = "February";
                    break;
                case 3:
                    nameOfMonth = "March";
                    break;
                case 4:
                    nameOfMonth = "April";
                    break;
                case 5:
                    nameOfMonth = "May";
                    break;
                case 6:
                    nameOfMonth = "June";
                    break;
                case 7:
                    nameOfMonth = "July";
                    break;
                case 8:
                    nameOfMonth = "August";
                    break;
                case 9:
                    nameOfMonth = "September";
                    break;
                case 10:
                    nameOfMonth = "October";
                    break;
                case 11:
                    nameOfMonth = "November";
                    break;
                case 12:
                    nameOfMonth = "December";
                    break;
            }


            switch (month) {
                case 1:
                    dayOfMonth = firstDayOfYear;
                    break;
                case 2:
                    dayOfMonth = (dayOfMonth + 31) % 7;
                    break;
                case 3:
                    dayOfMonth = (isLeapYear) ? (dayOfMonth + 29) % 7 : (dayOfMonth + 28) % 7;
                    break;
                case 4:
                    dayOfMonth = (dayOfMonth + 31) % 7;
                    break;
                case 5:
                    dayOfMonth = (dayOfMonth + 30) % 7;
                    break;
                case 6:
                    dayOfMonth = (dayOfMonth + 31) % 7;
                    break;
                case 7:
                    dayOfMonth = (dayOfMonth + 30) % 7;
                    break;
                case 8:
                    dayOfMonth = (dayOfMonth + 31) % 7;
                    break;
                case 9:
                    dayOfMonth = (dayOfMonth + 31) % 7;
                    break;
                case 10:
                    dayOfMonth = (dayOfMonth + 30) % 7;
                    break;
                case 11:
                    dayOfMonth = (dayOfMonth + 31) % 7;
                    break;
                case 12:
                    dayOfMonth = (dayOfMonth + 30) % 7;
                    break;
            }
            switch (dayOfMonth) {
                case 0:
                    nameOfDay = "Sunday";
                    break;
                case 1:
                    nameOfDay = "Monday";
                    break;
                case 2:
                    nameOfDay = "Tuesday";
                    break;
                case 3:
                    nameOfDay = "Wednesday";
                    break;
                case 4:
                    nameOfDay = "Thursday";
                    break;
                case 5:
                    nameOfDay = "Friday";
                    break;
                case 6:
                    nameOfDay = "Saturday";
                    break;
            }

            System.out.printf("%s 1, %d is %s", nameOfMonth, year, nameOfDay);
            System.out.println();


        }
    }
}

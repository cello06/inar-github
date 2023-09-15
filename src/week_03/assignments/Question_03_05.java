package week_03.assignments;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int numberOfDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int futureDay = input.nextInt() % 7;
        String nameOfToday=" ";
        String nameOfFutureDay=" ";

        switch (numberOfDay) {
            case 0:
                nameOfToday = "Sunday";
                break;
            case 1:
                nameOfToday = "Monday";
                break;
            case 2:
                nameOfToday = "Tuesday";
                break;
            case 3:
                nameOfToday = "Wednesday";
                break;
            case 4:
                nameOfToday = "Thursday";
                break;
            case 5:
                nameOfToday = "Friday";
                break;
            case 6:
                nameOfToday = "Saturday";
                break;
        }

        switch ((numberOfDay + futureDay) % 7) {
            case 0:
                nameOfFutureDay = "Sunday";
                break;
            case 1:
                nameOfFutureDay = "Monday";
                break;
            case 2:
                nameOfFutureDay = "Tuesday";
                break;
            case 3:
                nameOfFutureDay = "Wednesday";
                break;
            case 4:
                nameOfFutureDay = "Thursday";
                break;
            case 5:
                nameOfFutureDay = "Friday";
                break;
            case 6:
                nameOfFutureDay = "Saturday";
                break;
        }
        System.out.println("Today is " + nameOfToday +
                " and the future day is " + nameOfFutureDay);


    }
}

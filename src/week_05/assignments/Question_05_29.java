package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameOfMonth = "";

        int numberOfDay = 0;

        int startDayOfMonth = 0;

        boolean isLeapYear = false;


        System.out.print("Enter year : (e.g.,2012) : ");

        int year = input.nextInt();

        System.out.print("Enter first day of the year : ");

        int firstDayOfYear = input.nextInt();


        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeapYear = true;
        }


        for (int i = 1; i <= 12; i++) {


            switch (i) {
                case 1:
                    nameOfMonth = "January";
                    numberOfDay = 31;
                    startDayOfMonth = firstDayOfYear;
                    break;
                case 2:
                    nameOfMonth = "February";
                    numberOfDay = (isLeapYear) ? 29 : 28;
                    startDayOfMonth = (firstDayOfYear + 31) % 7;
                    break;
                case 3:
                    nameOfMonth = "March";
                    numberOfDay = 31;
                    startDayOfMonth = (isLeapYear) ? (startDayOfMonth + 29) % 7 : (startDayOfMonth + 28) % 7;
                    break;
                case 4:
                    nameOfMonth = "April";
                    numberOfDay = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 5:
                    nameOfMonth = "May";
                    numberOfDay = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 6:
                    nameOfMonth = "June";
                    numberOfDay = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 7:
                    nameOfMonth = "July";
                    numberOfDay = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 8:
                    nameOfMonth = "August";
                    numberOfDay = 31;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 9:
                    nameOfMonth = "September";
                    numberOfDay = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 10:
                    nameOfMonth = "October";
                    numberOfDay = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
                case 11:
                    nameOfMonth = "November";
                    numberOfDay = 30;
                    startDayOfMonth = (startDayOfMonth + 31) % 7;
                    break;
                case 12:
                    nameOfMonth = "December";
                    numberOfDay = 31;
                    startDayOfMonth = (startDayOfMonth + 30) % 7;
                    break;
            }


            System.out.println(nameOfMonth + " " + year);

            System.out.println("-----------------------------------------");

            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

            //to determine where to put '1', I used
            //this startDayOfMonth after calculating
            //each month's start day...

            if (startDayOfMonth % 7 == 1) {

                System.out.print("1\t");

            } else if (startDayOfMonth % 7 == 2) {

                System.out.print("\t1\t");

            } else if (startDayOfMonth % 7 == 3) {

                System.out.print("\t\t1\t");

            } else if (startDayOfMonth % 7 == 4) {

                System.out.print("\t\t\t1\t");

            } else if ((startDayOfMonth % 7 == 5)) {

                System.out.print("\t\t\t\t1\t");

            } else if ((startDayOfMonth % 7 == 6)) {

                System.out.print("\t\t\t\t\t1\t");

            } else {

                System.out.print("\t\t\t\t\t\t1\t");

            }

            //After determining where to put '1', I started to
            //find places of other numbers of the month...


            for (int j = 2; j <= numberOfDay; j++) {

                System.out.print(((startDayOfMonth - 2 + j) % 7 == 0) ? "\n" + j + "\t" : j + "\t");

            }
            System.out.println("\n");
        }

    }
}

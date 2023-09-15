package week_02.assignments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = input.nextInt();
        int totalDay = totalMinutes / (60 * 24); //converting minutes to day
        int totalYears = totalDay / 365;//converting number of days to number of years
        int day = totalDay % 365; // to show remaining days we need to use remaing number
        System.out.println(totalMinutes + " minutes is approximately " + totalYears +
                " years and " + day + " days");
    }
}

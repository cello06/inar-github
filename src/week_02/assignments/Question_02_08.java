package week_02.assignments;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.print("Enter the time zone offer to GMT: ");
        int timeZone = input.nextInt();
        int currentHourInTımeZone = (int) currentHour + timeZone;
        System.out.println("The current time is " + currentHourInTımeZone + ":" +
                currentMinutes + ":" + currentSecond);
    }
}

package week_03.assigments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gMT = input.nextInt();
        String timePeriod = " AM";
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        long currentHour = totalHour % 24;
        int currentHourAccordingToGMT = (int) (currentHour) + gMT;
        if (currentHourAccordingToGMT > 12) {
            currentHourAccordingToGMT = currentHourAccordingToGMT % 12;
            timePeriod = " PM";
        }
        if (currentHourAccordingToGMT == 12) {
            currentHourAccordingToGMT = 0;
        }
        System.out.println("The current time is " + currentHourAccordingToGMT + ":" + currentMinute + ":" + currentSecond + timePeriod);


    }
}

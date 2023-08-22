package week_03.assigments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String timePeriod = " AM";
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        long currentHour = totalHour % 24;
        if (currentHour > 12) {
            currentHour = currentHour % 12;
            timePeriod = " PM";
        }
        if(currentHour==12){
            currentHour=0;
        }
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + timePeriod);


    }
}

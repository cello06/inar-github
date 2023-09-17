package week_06.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds : ");
        long milliSeconds = input.nextLong();

        String time = convertMillis(milliSeconds);
        System.out.print("hours : minutes : seconds :" + time);
    }

    public static String convertMillis(long milliSeconds) {
        long totalSeconds = milliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        return currentHours + " : " + currentMinutes + " : " + currentSeconds;
    }
}

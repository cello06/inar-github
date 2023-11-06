package week_10.assignments.test;

import week_10.assignments.classes.Time;

public class Question_10_01 {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time);
        Time elapsedTime = new Time(555550000);
        System.out.println(elapsedTime);
    }
}

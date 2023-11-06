package week_09.assignments.test;

import week_09.assignments.classes.Fan;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        System.out.println(fan1);
        System.out.println("-------------------");
        System.out.println(fan2);
    }
}

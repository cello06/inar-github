package week_13.assignments.tests;

import week_13.assignments.classes.Circle_09;

public class Question_13_09 {
    public static void main(String[] args) {
        Circle_09 circle1 = new Circle_09(5);
        System.out.println("Circle1 " + circle1);
        Circle_09 circle2 = new Circle_09(6);
        System.out.println("Circle2 " + circle2);
        Circle_09 circle3 = new Circle_09(5);
        System.out.println("Circle3 " + circle3);

        System.out.println("Circle1 is " + (((circle1).equals(circle2) ? "" : "not ") + "equal to circle2"));
        System.out.println("Circle1 is " + (((circle1).equals(circle3) ? "" : "not ") + "equal to circle3"));


    }
}

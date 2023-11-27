package week_13.assignments.tests;

import week_13.assignments.classes.Rectangle_10;

public class Question_13_10 {
    public static void main(String[] args) {
        Rectangle_10 rectangle1 = new Rectangle_10(5,3);
        System.out.println("Rectangle1 " + rectangle1);
        Rectangle_10 rectangle2 = new Rectangle_10(5,3);
        System.out.println("Rectangle2 " + rectangle2);
        Rectangle_10 rectangle3 = new Rectangle_10(6,4);
        System.out.println("Rectangle3 " + rectangle3);

        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle2) ? "": "not ") + "equal to Rectangle2");
        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle3) ? "": "not ") + "equal to Rectangle3");

    }
}

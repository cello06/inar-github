package week_09.assignments.test;

import week_09.assignments.classes.Rectangle;

public class Question_09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);


        System.out.println("--Rectangle 1--");
        System.out.println("Width     :" + rectangle1.width);
        System.out.println("Height    :" + rectangle1.height);
        System.out.println("Area      :" + rectangle1.getArea());
        System.out.println("Perimeter :" + rectangle1.getPerimeter());
        System.out.println();
        System.out.println("--Rectangle 2--");
        System.out.println("Width     :" + rectangle2.width);
        System.out.println("Height    :" + rectangle2.height);
        System.out.println("Area      :" + rectangle2.getArea());
        System.out.println("Perimeter :" + rectangle2.getPerimeter());

    }
}

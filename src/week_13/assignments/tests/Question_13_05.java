package week_13.assignments.tests;

import week_13.assignments.classes.Circle;
import week_13.assignments.classes.GeometricObjectNotAbstract;
import week_13.assignments.classes.Rectangle;

public class Question_13_05 {
    public static void main(String[] args) {
        GeometricObjectNotAbstract circle1 = new Circle(5);
        circle1.setColor("green");
        circle1.setFilled(true);
        GeometricObjectNotAbstract circle2 = new Circle(3);
        circle2.setColor("red");
        System.out.println("The larger of the two circle is : ");
        System.out.println(GeometricObjectNotAbstract.max(circle1, circle2));

        System.out.println("-------------------------------------");

        GeometricObjectNotAbstract rectangle1 = new Rectangle(15, 12);
        rectangle1.setColor("green");
        GeometricObjectNotAbstract rectangle2 = new Rectangle(2, 6);
        rectangle2.setColor("red");
        System.out.println("The larger of the two rectangle is : ");
        System.out.println(GeometricObjectNotAbstract.max(rectangle1, rectangle2));


    }
}

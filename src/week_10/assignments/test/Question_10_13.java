package week_10.assignments.test;

import week_10.assignments.classes.MyRectangle2D;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D rectangle = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Rectangle :");
        System.out.println("-------------------------");
        System.out.println("Area      : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
        System.out.println((rectangle.contains(3, 3) ? "" : "does not ") + "contains the point (3,3)");
        System.out.println((rectangle.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "" : "does not ")
                + "contain the rectangle with points (4 ,5 ,10.5 , 3.2)");
        System.out.println((rectangle.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "" : "does not ")
                + "overlap the rectangle with points (3, 5, 2.3, 5.4)");
    }
}

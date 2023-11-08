package week_10.assignments.test;

import week_10.assignments.classes.MyPoint;
import week_10.assignments.classes.Triangle2D;

public class Question_10_12 {
    //Answer is wrong!! Be careful !!!
    public static void main(String[] args) {
        Triangle2D triangle = new Triangle2D(new MyPoint(2.5, 2),
                new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));
        System.out.println("Area          : " + triangle.getArea());
        System.out.println("Perimeter     : " + triangle.getPerimeter());
        MyPoint p = new MyPoint(3, 3);
        System.out.println("t1 contains (3,3) : " + triangle.contains(p));
        Triangle2D t2 = new Triangle2D(new MyPoint(2.9, 2),
                new MyPoint(4, 1),
                new MyPoint(1, 3.4));
        System.out.println("t1 contains  (new Triangle2D(new MyPoint(2.9, 2) ,new MyPoint(4, 1)\n, MyPoint(1, 3.4))) : "
                + triangle.contains(t2));
        Triangle2D t3 = new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5));

        System.out.println("ti overlaps  (new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3)\n, new MyPoint(2, 6.5))) :" +
                triangle.overlaps(t3));

    }
}

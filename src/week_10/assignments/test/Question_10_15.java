package week_10.assignments.test;

import week_10.assignments.classes.MyRectangle2D;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.print("Enter five points :");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D boundingRectangle = MyRectangle2D.getRectangle(points);
        System.out.println("The bounding rectangle's center is " +
                "(" + boundingRectangle.getX() + " , " + boundingRectangle.getY() + "), " +
                "width " + boundingRectangle.getWidth() + ", height " + boundingRectangle.getHeight());

    }
}

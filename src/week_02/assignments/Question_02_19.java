package week_02.assignments;

import java.util.Scanner;

public class Question_02_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        /* to calculate a side of triangle we will use the formula
        that we used in Question_02_15
         */
        double firstSide = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double secondSide = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
        double thirdSide = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        //to calculate area we need to find
        //s=(side1+side2+side3)/2;
        double side = (firstSide + secondSide + thirdSide) / 2;
        double area = Math.pow(side * (side - firstSide) *
                (side - secondSide) * (side - thirdSide), 0.5);
        System.out.println("The area of the triangle is " + (int)(area*10)/10.0);

    }
}

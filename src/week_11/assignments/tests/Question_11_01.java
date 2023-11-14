package week_11.assignments.tests;

import week_11.assignments.classes.GeometricObject;
import week_11.assignments.classes.Triangle;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter a color : ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false) :");
        String a = input.next();
        boolean isFilled = convertToBoolean(a);
        GeometricObject triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);
        displayObject(triangle);
    }

    public static boolean convertToBoolean(String isFilled) {
        if (isFilled.equalsIgnoreCase("true")) {
            return true;
        } else if (isFilled.equalsIgnoreCase("false")) {
            return false;
        } else {
            System.out.println("You enter sth wrong !");
            System.exit(1);
        }
        return false;
    }

    public static void displayObject(GeometricObject object) {
        if (object instanceof Triangle) {
            System.out.println(((Triangle) object).toString());
        }
    }
}

package week_13.assignments.tests;

import week_12.assignments.classes.IllegalTriangleException;
import week_13.assignments.classes.GeometricObject;
import week_13.assignments.classes.Triangle;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Enter three sides of the triangle :");
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();
                GeometricObject triangle = new Triangle(side1, side2, side3);
                input.nextLine();
                System.out.println("Enter the color :");
                String color = input.nextLine();
                System.out.println("Enter : isFilled ? true of false :");
                String isFilledStr = input.nextLine();
                boolean isFilled;
                if (isFilledStr.toLowerCase(Locale.ROOT).equals("false")) {
                    isFilled = false;
                } else if (isFilledStr.toLowerCase(Locale.ROOT).equals("true")) {
                    isFilled = true;
                } else {
                    throw new InputMismatchException("Wrong input !");
                }
                triangle.setColor(color);
                triangle.setFilled(isFilled);
                System.out.println(triangle.toString());
                condition = false;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input , try again! \n Enter a character to continue!");
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
            if (condition) {
                input.nextLine();
            }
        }
    }
}

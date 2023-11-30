package week_13.assignments.tests;

import week_13.assignments.classes.Complex;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (Math.pow(b, 2)) - (4 * a * c); //formula of discriminant to find root
        double root1;
        double root2;

        if (discriminant > 0) {
            root1 = (((-1) * b) + (Math.pow(discriminant, 0.5))) / (2 * a);
            root2 = (((-1) * b) - (Math.pow(discriminant, 0.5))) / (2 * a);
            System.out.println("The equation has two roots " +
                    (float) root1 + " and " + (float) root2);
        } else if (discriminant == 0) {
            root1 = (((-1) * b) + (Math.pow(discriminant, 0.5))) / (2 * a);
            System.out.println("The equation has one root " + root1);
        } else {
            discriminant *= -1;
            Complex complexRoot1 = new Complex(((-1) * b) / (2 * a), Math.sqrt(discriminant) / (2 * a));
            Complex complexRoot2 = new Complex(((-1) * b) / (2 * a), Math.sqrt(discriminant) / (2 * a) * -1);
            System.out.println("The roots are " + complexRoot1 + " and " + complexRoot2);
        }
    }
}

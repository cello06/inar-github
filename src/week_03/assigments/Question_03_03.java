package week_03.assigments;

import java.util.Scanner;

public class Question_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double resultOfX;
        double resultOfY;
        //(a*d)-(b*c) is denominator of formula
        //so it must not be zero

        double denominatrOfFormula = (a * d) - (b * c);

        if (denominatrOfFormula == 0) {
            System.out.println("The equation has no solution");
        } else {
            resultOfX = ((e * d) - (b * f)) / (denominatrOfFormula);
            resultOfY = ((a * f) - (e * c)) / (denominatrOfFormula);
            System.out.println("x is " + resultOfX + " and y is " + resultOfY);
        }

    }
}

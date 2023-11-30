package week_13.assignments.tests;

import week_13.assignments.classes.Complex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Enter the first complex number  :");
                double realPart1 = input.nextDouble();
                double imaginaryPart1 = input.nextDouble();
                Complex complexNumber1 = new Complex(realPart1, imaginaryPart1);

                System.out.print("Enter the second complex number :");
                double realPart2 = input.nextDouble();
                double imaginaryPart2 = input.nextDouble();
                Complex complexNumber2 = new Complex(realPart2, imaginaryPart2);

                printSum(complexNumber1, complexNumber2);
                printSubtract(complexNumber1, complexNumber2);
                printMultiply(complexNumber1, complexNumber2);
                printDivide(complexNumber1, complexNumber2);
                printABS(complexNumber1);
                printABS(complexNumber2);

                condition = false;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong value you need to enter double value !");
                input.nextLine();
            }
        }
    }

    public static void printSum(Complex c1, Complex c2) {
        System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
    }

    public static void printSubtract(Complex c1, Complex c2) {
        System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
    }

    public static void printMultiply(Complex c1, Complex c2) {
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
    }

    public static void printDivide(Complex c1, Complex c2) {
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(c2));
    }

    public static void printABS(Complex c) {
        System.out.println("|" + c + "|" + " = " + c.abs());
    }
}

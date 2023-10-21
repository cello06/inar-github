package week_08.assignments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[] b = new double[2];
        System.out.println("Enter a00 , a01, a10 ,a11, b0 and b1 : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }

        if (!isAvailable(a)) {
            System.out.println("The equation has no solution");
        } else {
            double[] results = linearEquation(a, b);
            printResult(results);
        }
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] results = new double[2];// x and y
        double x = 0;
        double y = 0;
        if (isAvailable(a)) {
            x = calculateX(a, b);
            y = calculateY(a, b);
            results[0] = x;
            results[1] = y;
        }
        return results;
    }

    public static boolean isAvailable(double[][] a) {
        //a00*a11 - a01*a10 = 0  -> no solution
        return calculateDenominator(a) != 0;
    }

    public static double calculateDenominator(double[][] a) {
        return ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
    }

    public static double calculateX(double[][] a, double[] b) {
        return (b[0] * a[1][1] - b[1] * a[0][1]) / calculateDenominator(a);
    }

    public static double calculateY(double[][] a, double[] b) {
        return (b[1] * a[0][0] - b[0] * a[1][0]) / calculateDenominator(a);
    }

    public static void printResult(double[] result) {
        System.out.println("x is " + result[0] + " and y is " + result[1]);
    }
}

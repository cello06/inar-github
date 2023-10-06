package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        quadraticEquationProblem();
    }

    public static void quadraticEquationProblem() {
        double[] coefficients = getCoefficients();
        double[] roots = new double[2];

        int countOfRoots = solveQuadratic(coefficients, roots);
        printResult(countOfRoots, roots);
    }

    public static double[] getCoefficients() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        double[] coefficients = new double[3];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = input.nextInt();
        }
        return coefficients;
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        //Discriminant = b^2-4ac;
        int countOfRoots;
        double discriminant = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / 2 * eqn[0];
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / 2 * eqn[0];
            countOfRoots = 2;
        } else if (discriminant == 0) {
            roots[0] = (-eqn[1]) / (2 * eqn[0]);
            countOfRoots = 1;
        } else {
            countOfRoots = 0;
        }
        return countOfRoots;
    }

    public static void printResult(int countOfRoots, double[] roots) {

        if (countOfRoots == 2) {
            System.out.println("The number of real roots : " + countOfRoots);
            System.out.println("The roots of equation " + roots[0] + " " + roots[1]);
        } else if (countOfRoots == 1) {
            System.out.println("The number of real roots : " + countOfRoots);
            System.out.println("The root of equation " + roots[0]);
        } else {
            System.out.println("The equation has no real root.");
        }
    }
}

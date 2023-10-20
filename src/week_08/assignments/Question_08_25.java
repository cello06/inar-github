package week_08.assignments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        printIfMatrixIsMarkovOrNot(matrix);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;

    }

    public static void printIfMatrixIsMarkovOrNot(double[][] matrix) {
        System.out.println("It is " + (isMarkovMatrix(matrix) ? "" : "not ") + "a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        if (!hasNegative(matrix)) {
            return false;
        }
        if (!isSumOfColumns1(matrix)) {
            return false;
        }
        return true;
    }

    public static boolean hasNegative(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSumOfColumns1(double[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            double sumOfThisColumn = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumOfThisColumn += matrix[row][column];
            }
            if (sumOfThisColumn != 1) {
                return false;
            }
        }
        return true;
    }
}

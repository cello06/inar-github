package week_08.assignments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1 :");
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2 :");
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                matrix2[row][column] = input.nextDouble();
            }
        }
        double[][] multiply = multiplyMatrix(matrix1, matrix2);
        printCalculation(matrix1, matrix2, multiply);
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multiply = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < multiply.length; row++) {
            for (int column = 0; column < multiply[row].length; column++) {
                multiply[row][column] = instantMultiply(row, column, matrix1, matrix2);
            }
        }
        return multiply;
    }

    public static double instantMultiply(int row, int column, double[][] matrix1, double[][] matrix2) {
        double result = 0;
        for (int i = 0; i < matrix1.length; i++) {
            result += (matrix1[row][i] * matrix2[i][column]);
        }
        return result;
    }

    public static void printCalculation(double[][] matrix1, double[][] matrix2, double[][] result) {
        for (int row = 0; row < result.length; row++) {
            for (int columnOfMatrix1 = 0; columnOfMatrix1 < matrix1[row].length; columnOfMatrix1++) {
                System.out.printf("%3.1f ", matrix1[row][columnOfMatrix1]);
            }
            if (row == 1) {
                System.out.print("   *   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfMatrix2 = 0; columnOfMatrix2 < matrix2[row].length; columnOfMatrix2++) {
                System.out.printf("%3.1f ", matrix2[row][columnOfMatrix2]);
            }
            if (row == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfResult = 0; columnOfResult < result[row].length; columnOfResult++) {
                System.out.printf("%3.1f ", result[row][columnOfResult]);
            }
            System.out.println();
        }
    }
}

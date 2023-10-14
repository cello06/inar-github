package week_08.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        printSumOfElementsInMajorDiagonal(sumMajorDiagonal(matrix));
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the dimension of the matrix (4 for--> 4-4 matrix): ");
        int dimension = input.nextInt();
        double[][] matrix = new double[dimension][dimension];
        System.out.println("Enter a " + dimension + "-" + dimension + " matrix row by row :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void printSumOfElementsInMajorDiagonal(double sumOfMajorDiagonal) {
        System.out.println("Sum of the elements in the major diagonal is " + sumOfMajorDiagonal);
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sumOfMajorDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            sumOfMajorDiagonal += matrix[row][row];
        }
        return sumOfMajorDiagonal;
    }
}

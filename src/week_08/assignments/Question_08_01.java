package week_08.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        printSumOfColumns(matrix);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row : ");
        double[][] matrix = new double[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void printSumOfColumns(double[][] matrix) {

        for (int column = 0; column < matrix[0].length; column++) {
            double sumOfThisColumn = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumOfThisColumn += matrix[row][column];
            }
            System.out.println("Sum of the elements at column " + column + " is " + sumOfThisColumn);
        }
    }
}

package week_08.assignments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        double[][] columnSortedMatrix = sortColumns(matrix);
        System.out.println("The column-sorted array is ");
        printMatrix(columnSortedMatrix);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row ");
        double[][] matrix = new double[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] sortColumns(double[][] matrix) {
        double[][] sorted = new double[matrix.length][matrix[0].length];
        for (int column = 0; column < matrix[0].length; column++) {
            double[] currentColumn = getColumn(column, matrix);
            sort(currentColumn);
            for (int rowOfSorted = 0; rowOfSorted < sorted.length; rowOfSorted++) {
                sorted[rowOfSorted][column] = currentColumn[rowOfSorted];
            }

        }
        return sorted;
    }

    public static double[] getColumn(int indexOfColumn, double[][] matrix) {
        double[] column = new double[matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            column[row] = matrix[row][indexOfColumn];
        }
        return column;
    }

    public static void sort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            double currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }

    }

    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

}

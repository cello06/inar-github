package week_08.assignments;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        double[][] sortedMatrix = sortRows(matrix);


        System.out.println("The row-sorted array is :");
        printMatrix(sortedMatrix);
        System.out.println("The non-sorted matrix is :");
        printMatrix(matrix);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] sortRows(double[][] matrix) {
        double[][] sortedIndex = new double[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            double[] currentRow = copy(matrix[row]);
            sort(currentRow);
            sortedIndex[row] = copy(currentRow);
        }
        return sortedIndex;
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

    public static double[] copy(double[] row) {
        double[] copy = new double[row.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = row[i];
        }
        return copy;
    }


    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
    }
}

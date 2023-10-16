package week_08.assignments;

import java.util.Scanner;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        printMatrix(matrix);
        int maxRowIndex = getMaxRowIndexWith1s(matrix);
        int maxColumnIndex = getMaxColumnIndexWith1s(matrix);
        printRowAndColumnWithMost1s(maxRowIndex, maxColumnIndex);
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of your matrix = ");
        int dimension = input.nextInt();
        int[][] matrix = new int[dimension][dimension];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int getMaxRowIndexWith1s(int[][] matrix) {
        int rowOfMaximumCountOfOne = 0;
        int indexOfMaxCountRow = 0;
        for (int row = 0; row < matrix.length; row++) {
            int countOfOneOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    countOfOneOfThisRow++;
                }
            }
            if (countOfOneOfThisRow > rowOfMaximumCountOfOne) {
                rowOfMaximumCountOfOne = countOfOneOfThisRow;
                indexOfMaxCountRow = row;
            }
        }
        return indexOfMaxCountRow;
    }

    public static int getMaxColumnIndexWith1s(int[][] matrix) {
        int columnOfMaximumCountOfOne = 0;
        int indexOfMaxCountColumn = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            int countOfOneOfThisColumn = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 1) {
                    countOfOneOfThisColumn++;
                }
            }
            if (countOfOneOfThisColumn > columnOfMaximumCountOfOne) {
                columnOfMaximumCountOfOne = countOfOneOfThisColumn;
                indexOfMaxCountColumn = column;
            }
        }
        return indexOfMaxCountColumn;
    }

    public static void printRowAndColumnWithMost1s(int maxRowIndex, int maxColumnIndex) {
        System.out.println("The largest row index : " + maxRowIndex);
        System.out.println("The largest column index : " + maxColumnIndex);
    }
}

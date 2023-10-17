package week_08.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        printSamenessInMatrix(matrix);
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix : ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void printSamenessInMatrix(int[][] matrix) {
        printMatrix(matrix);
        printRowsForSameValues(matrix);
        printColumnsForSameValues(matrix);
        printMajorDiagonalForSameValues(matrix);
        printSubDiagonalForSameValues(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void printRowsForSameValues(int[][] matrix) {

        int countOfRowsNotIncludeSameNumbers = 0;

        for (int row = 0; row < matrix.length; row++) {
            int countOf1 = 0;
            int countOf0 = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    countOf1++;
                } else {
                    countOf0++;
                }
            }
            if (countOf0 == matrix.length) {
                System.out.println("All 0s on row " + row);
            } else if (countOf1 == matrix.length) {
                System.out.println("All 1s on row " + row);
            } else {
                countOfRowsNotIncludeSameNumbers++;
            }
        }
        if (countOfRowsNotIncludeSameNumbers == matrix.length) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void printColumnsForSameValues(int[][] matrix) {
        int countOfColumnsNotIncludeSameNumbers = 0;


        for (int column = 0; column < matrix.length; column++) {
            int countOf1 = 0;
            int countOf0 = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 1) {
                    countOf1++;
                } else {
                    countOf0++;
                }
            }
            if (countOf1 == matrix.length) {
                System.out.println("All 1s on column " + column);
            } else if (countOf0 == matrix.length) {
                System.out.println("All 0s on column " + column);
            } else {
                countOfColumnsNotIncludeSameNumbers++;
            }
        }
        if (countOfColumnsNotIncludeSameNumbers == matrix.length) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void printMajorDiagonalForSameValues(int[][] matrix) {
        int countOf1 = 0;
        int countOf0 = 0;

        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][row] == 1) {
                countOf1++;
            } else {
                countOf0++;
            }
        }
        if (countOf1 == matrix.length) {
            System.out.println("All 1s on the major diagonal");
        } else if (countOf0 == matrix.length) {
            System.out.println("All 0s on the major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void printSubDiagonalForSameValues(int[][] matrix) {
        int countOf1 = 0;
        int countOf0 = 0;
        int indexOfColumn = matrix.length - 1;

        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][indexOfColumn] == 1) {
                countOf1++;
            } else {
                countOf0++;
            }
            indexOfColumn--;
        }
        if (countOf1 == matrix.length) {
            System.out.println("All 1s on the sub diagonal");
        } else if (countOf0 == matrix.length) {
            System.out.println("All 0s on the sub diagonal");
        } else {
            System.out.println("No same numbers on the sub diagonal");
        }
    }
}

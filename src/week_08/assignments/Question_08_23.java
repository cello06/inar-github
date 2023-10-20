package week_08.assignments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        printFlippedCell(matrix);

    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix(includes only 1 and 0) row by row :");
        int[][] matrix = new int[6][6];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int number = input.nextInt();
                if (isNumberAvailable(number)) {
                    matrix[row][column] = number;
                } else {
                    System.out.println("Invalid input");
                    column--;
                }
            }
        }
        return matrix;
    }

    public static boolean isNumberAvailable(int number) {
        return number == 0 || number == 1;
    }

    public static void printFlippedCell(int[][] matrix) {
        //I will check rows and columns , and find out which row and column
        //incorporates  not even 1s.
        int indexOfNotEven1sRow = getNotEvenRow(matrix);
        int indexOfNotEven1sColumn = getNotEvenColumn(matrix);
        if (indexOfNotEven1sRow != -1 && indexOfNotEven1sColumn != -1) {
            System.out.println("The flipped cell is at (" + indexOfNotEven1sRow + "," + indexOfNotEven1sColumn + ")");
        } else {
            System.out.println("There is no flipped cell.");
        }
    }

    public static int getNotEvenRow(int[][] matrix) {
        int indexOfNotEven1sRow = -1;
        for (int row = 0; row < matrix.length; row++) {
            int countOf1s = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    countOf1s++;
                }
            }
            if (countOf1s % 2 != 0) {
                indexOfNotEven1sRow = row;
            }
        }
        return indexOfNotEven1sRow;
    }

    public static int getNotEvenColumn(int[][] matrix) {
        int indexOfNotEven1sColumn = -1;
        for (int column = 0; column < matrix[0].length; column++) {
            int countOf1s = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 1) {
                    countOf1s++;
                }
            }
            if (countOf1s % 2 != 0) {
                indexOfNotEven1sColumn = column;
            }
        }
        return indexOfNotEven1sColumn;
    }
}

package week_08.assignments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        int[] largestBlockInfo = findLargestBlock(matrix);
        printLargestBlockInfo(largestBlockInfo);
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix : ");
        int countOfRows = input.nextInt();
        int[][] matrix = new int[countOfRows][countOfRows];
        System.out.println("Enter the matrix row by row : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[] findLargestBlock(int[][] matrix) {
        int maxCountOfRowForSquareMatrix = 0;
        int[] largestBlockInfo = {0, 0, maxCountOfRowForSquareMatrix};
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    int countOfRowForSquareMatrix = findBlock(row, column, matrix);
                    if (countOfRowForSquareMatrix > maxCountOfRowForSquareMatrix) {
                        maxCountOfRowForSquareMatrix = countOfRowForSquareMatrix;
                        largestBlockInfo[0] = row;
                        largestBlockInfo[1] = column;
                        largestBlockInfo[2] = maxCountOfRowForSquareMatrix;
                    }
                }
            }
        }
        return largestBlockInfo;
    }

    public static int findBlock(int row, int column, int[][] matrix) {
        int currentRow = row;
        int currentColumn = column;
        int maxRow = 0;
        boolean trueCondition = true;
        if (column == matrix[row].length - 1 || row == matrix.length - 1) {
            return maxRow;
        }
        while (true) {//checking for the largest 1s block
            currentColumn++;//with every column increase I check for the rows if they all 1s
            if (currentColumn < matrix[row].length && matrix[currentRow][currentColumn] == 1) {
                for (int i = 0; i < currentColumn - column; i++) {//this loop determine how many rows I will check
                    currentRow++;
                    if (currentRow == matrix.length) {//if increasing of currentRow is not appropriate for my index bounds return max to finish loop
                        return maxRow;
                    }
                    for (int j = column; j <= currentColumn; j++) {
                        if (matrix[currentRow][j] != 1) {//if there is a number other than 1, then break loop with an important boolean value
                            trueCondition = false;
                            break;
                        }
                    }
                    if (!trueCondition) {
                        break;
                    }
                }
            } else {
                return maxRow;
            }
            if (trueCondition) {
                maxRow = currentRow - row + 1;
                currentRow = row;
            } else {
                break;
            }
        }
        return maxRow;
    }

    public static void printLargestBlockInfo(int[] info) {
        System.out.println("The maximum square submatrix is at (" + info[0] + "," + info[1] + ") with size " + info[2]);
    }
}

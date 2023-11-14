package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        int[][] array = getArray();
        printArray(array);
        ArrayList<Integer> largestRows = findLargestRows(array);
        ArrayList<Integer> largestColumns = findLargestColumns(array);
        System.out.println("The largest row index :" + largestRows);
        System.out.println("The largest column index :" + largestColumns);
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n : ");
        int count = input.nextInt();
        int[][] result = new int[count][count];
        for (int row = 0; row < result.length; row++) {
            for (int column = 0; column < result[row].length; column++) {
                result[row][column] = (int) (Math.random() * 2);
            }
        }
        return result;
    }

    public static void printArray(int[][] array) {
        System.out.println("The random array is ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> findLargestRows(int[][] array) {
        ArrayList<Integer> maxIndexesOfRows = new ArrayList<>();
        int maxCount = 0;
        for (int row = 0; row < array.length; row++) {
            int countOf1InCurrentRow = 0;
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == 1) {
                    countOf1InCurrentRow++;
                }
            }
            if (countOf1InCurrentRow > maxCount) {
                maxCount = countOf1InCurrentRow;
            }
        }
        for (int row = 0; row < array.length; row++) {
            int countOf1InCurrentRow = 0;
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == 1) {
                    countOf1InCurrentRow++;
                }
            }
            if (countOf1InCurrentRow == maxCount) {
                maxIndexesOfRows.add(row);
            }
        }
        return maxIndexesOfRows;
    }

    public static ArrayList<Integer> findLargestColumns(int[][] array) {
        ArrayList<Integer> maxIndexesOfColumns = new ArrayList<>();
        int maxCount = 0;
        for (int column = 0; column < array[0].length; column++) {
            int countOf1InCurrentColumn = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == 1) {
                    countOf1InCurrentColumn++;
                }
            }
            if (countOf1InCurrentColumn > maxCount) {
                maxCount = countOf1InCurrentColumn;
            }
        }
        for (int column = 0; column < array[0].length; column++) {
            int countOf1InCurrentColumn = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == 1) {
                    countOf1InCurrentColumn++;
                }
            }
            if (countOf1InCurrentColumn == maxCount) {
                maxIndexesOfColumns.add(column);
            }
        }
        return maxIndexesOfColumns;
    }
}

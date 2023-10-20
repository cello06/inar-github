package week_08.assignments;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        int[][] matrix1 = getMatrix(1);
        int[][] matrix2 = getMatrix(2);
        printStateOfIdentical(matrix1, matrix2);
    }

    public static int[][] getMatrix(int listName) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.print("Enter list" + listName + " : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void printStateOfIdentical(int[][] list1, int[][] list2) {
        System.out.println("The two arrays are " + (equals(list1, list2) ? "" : "not ") + "strictly identical");
    }

    public static boolean equals(int[][] list1, int[][] list2) {
        for (int row = 0; row < list1.length; row++) {
            for (int column = 0; column < list1[0].length; column++) {
                if (list1[row][column] != list2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}

package week_08.assignments;

import java.util.Scanner;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] array = getArray();
        shuffle(array);
        printArray(array);
    }

    public static int[][] getArray() {
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter number of rows :");
        //int countOfRows = input.nextInt();
        //System.out.println("Enter number of columns : ");
        //int countOfColumns = input.nextInt();
        //int[][] array = new int[countOfRows][countOfColumns];
        //System.out.println("Enter " + countOfColumns + " column for " + countOfRows + " rows");
        //for (int row = 0; row < array.length; row++) {
        //  for (int column = 0; column < array[row].length; column++) {
        //    array[row][column] = input.nextInt();
        // }
        //}
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};// for testing 
        return m;
    }

    public static void shuffle(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            int randomIndex = (int) (Math.random() * array.length);
            int[] temp = array[row];
            array[row] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    public static void printArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}

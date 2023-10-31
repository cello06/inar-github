package week_09.assignments;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {

        double[][] array = getArray();
        Location largest = locateLargest(array);
        printLargestLocation(largest);
    }

    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array :");
        int countOfRow = input.nextInt();
        int countOfColumn = input.nextInt();
        double[][] array = new double[countOfRow][countOfColumn];
        System.out.println("Enter the array :");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }
        return array;
    }

    public static Location locateLargest(double[][] array) {
        Location largestLocation = new Location();
        largestLocation.maxValue = array[0][0];
        largestLocation.row = 0;
        largestLocation.column = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (row == 0 && column == 0) {
                    continue;
                }
                if (largestLocation.maxValue < array[row][column]) {
                    largestLocation.maxValue = array[row][column];
                    largestLocation.row = row;
                    largestLocation.column = column;
                }
            }
        }
        return largestLocation;
    }

    public static void printLargestLocation(Location largest) {
        System.out.println("The location of the largest element is " +
                largest.maxValue + " at (" + largest.row + "," + largest.column + ")");
    }
}

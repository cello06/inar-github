package week_08.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        double[][] numbers = getArray();
        int[] locationOfLargest = locateLargest(numbers);
        printLargest(locationOfLargest);
    }

    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array : ");
        int countOfRow = input.nextInt();
        int countOfColumn = input.nextInt();
        double[][] array = new double[countOfRow][countOfColumn];
        System.out.println("Enter the array : ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }
        return array;
    }

    public static int[] locateLargest(double[][] numbers) {
        double largestNumber = numbers[0][0];
        int rowOfLargest = 0;
        int columnOfLargest = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 1; column < numbers[row].length; column++) {
                if (numbers[row][column] > largestNumber) {
                    largestNumber = numbers[row][column];
                    rowOfLargest = row;
                    columnOfLargest = column;
                }
            }
        }
        return new int[]{rowOfLargest, columnOfLargest};
    }

    public static void printLargest(int[] locationOfLarges) {
        System.out.println("The location of the largest element is at ("
                + locationOfLarges[0] + "," + locationOfLarges[1] + ")");
    }
}

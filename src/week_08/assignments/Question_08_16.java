package week_08.assignments;

import java.util.Scanner;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(array);
        printArray(array);
    }

    public static void sort(int[][] array) {
        int[] currentMinXY = new int[2];
        for (int point = 0; point < array.length; point++) {
            currentMinXY[0] = array[point][0];
            int currentMinIndex = point;
            for (int secondPoint = point + 1; secondPoint < array.length; secondPoint++) {
                if (currentMinXY[0] > array[secondPoint][0]) {
                    currentMinXY[0] = array[secondPoint][0];
                    currentMinXY[1] = array[secondPoint][1];
                    currentMinIndex = secondPoint;
                }
            }
            if (currentMinIndex != point) {
                array[currentMinIndex][0] = array[point][0];
                array[currentMinIndex][1] = array[point][1];
                array[point][0] = currentMinXY[0];
                array[point][1] = currentMinXY[1];

            }
        }
        for (int point = 0; point < array.length; point++) {
            int currentMinY = array[point][1];
            int indexOfCurrentMinY = point;
            for (int secondPoint = point + 1; secondPoint < array.length; secondPoint++) {
                if (array[point][0] == array[secondPoint][0]) {
                    if (currentMinY > array[secondPoint][1]) {
                        currentMinY = array[secondPoint][1];
                        indexOfCurrentMinY = secondPoint;
                    }
                }

            }
            if (indexOfCurrentMinY != point) {
                array[indexOfCurrentMinY][1] = array[point][1];
                array[point][1] = currentMinY;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("(" + array[i][0] + "," + array[i][1] + ")");
        }
    }
}

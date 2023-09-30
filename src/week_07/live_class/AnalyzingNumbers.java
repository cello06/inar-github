package week_07.live_class;

import java.util.Scanner;

public class AnalyzingNumbers {
    public static void main(String[] args) {
        double[] numbers = getListFromUser();
        double average = getAverage(numbers);
        printAverage(average);
        int countOfNumbersAboveAverage = getCountOfNumbersAboveAverage(average, numbers);
        printCountOfNumbersAboveAverage(countOfNumbersAboveAverage);

    }

    public static double[] getListFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int countOfNumbers = input.nextInt();


        double[] numbers = new double[countOfNumbers];
        System.out.print("Enter the numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }

    public static double getAverage(double[] list) {
        double sum = 0;
        double average;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        average = sum / list.length;
        return average;
    }

    public static void printAverage(double average) {
        System.out.println("Average is " + average);
    }

    public static int getCountOfNumbersAboveAverage(double average, double[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > average) {
                count++;
            }
        }
        return count;
    }

    public static void printCountOfNumbersAboveAverage(int count) {
        System.out.println("Number of elements above the average is " + count);

    }
}

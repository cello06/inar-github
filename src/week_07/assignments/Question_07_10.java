package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        double[] numbers = getNumbers();
        double minimumNumber = min(numbers);
        int firstIndexOfMin = getFirstIndexOfMin(minimumNumber, numbers);
        printMinimumNumberAndFirstIndexOfIt(minimumNumber, firstIndexOfMin);
    }

    public static double[] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }

    public static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getFirstIndexOfMin(double min, double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                return i;
            }
        }
        return -1;
    }

    public static void printMinimumNumberAndFirstIndexOfIt(double minimumNumber, int firstIndexOfMin) {
        System.out.println("The minimum number is " + minimumNumber + " index " + firstIndexOfMin);
    }
}

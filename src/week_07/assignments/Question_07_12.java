package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        double[] numbers = getNumbers();
        reverse(numbers);
        printNumbers(numbers);
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

    public static void reverse(double[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            if (i >= j) {//This condition helps me to stop swapping when the array is completely reversed.
                break;
            }
            double temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }

    public static void printNumbers(double[] numbers) {
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }
}

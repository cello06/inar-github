package week_07.assignments;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        controlSortedOrNot();
    }

    public static void controlSortedOrNot() {
        int[] numbers = getNumbers();
        printIsSortedOrNot(numbers);
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int countOfNumbers = input.nextInt();
        int[] numbers = new int[countOfNumbers];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static void printIsSortedOrNot(int[] numbers) {
        System.out.println("The list is " + ((isSorted(numbers)) ? " already sorted" : " not sorted"));
    }

    public static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

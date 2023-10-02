package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        int[] numbers = getTenNumbers();

        int[] reversedNumbers = reverse(numbers);

        printList(reversedNumbers);
    }

    public static int[] getTenNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers : ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int[] reverse(int[] list) {
        int[] reversedNumbers = new int[list.length];

        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reversedNumbers[i] = list[j];
        }
        return reversedNumbers;
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

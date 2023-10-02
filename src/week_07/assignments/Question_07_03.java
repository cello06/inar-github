package week_07.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        int[] numbers = getCountsOfNumbers();
        printCountsOfNumbers(numbers);
    }

    public static int[] getCountsOfNumbers() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[101];
        System.out.print("Enter the integers between 1 and 100 : ");
        for (int number : numbers) {
            number = input.nextInt();
            if (number == 0) {
                break;
            } else if(number == 100){
                numbers[100]++;
            } else {
                numbers[number % 100]++;
            }
        }
        return numbers;
    }

    public static void printCountsOfNumbers(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                System.out.println(i + " occurs " + list[i] + ((list[i] > 1) ? " times" : " time"));
            }
        }
    }
}

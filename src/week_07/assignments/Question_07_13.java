package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        int[] excludedNumbers = getExcludedNumbers();
        int number = getRandom(excludedNumbers);
        System.out.println("Number generated : " + number);
    }

    public static int[] getExcludedNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to exclude from random (1-54) : ");
        int[] excludedNumbers = new int[10];
        for (int i = 0; i < excludedNumbers.length; i++) {
            excludedNumbers[i] = input.nextInt();
        }
        return excludedNumbers;
    }

    public static int getRandom(int...excludedNumbers) {
        int random = (int) (Math.random() * 55 + 1);
        for (int i = 0; i < excludedNumbers.length; i++) {
            if (random == excludedNumbers[i]) {
                i = 0;
                random = (int) (Math.random() * 55 + 1);
            }
        }
        return random;
    }
}

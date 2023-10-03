package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        numbers = eliminateDuplicates(numbers);
        int countOfDistinctNumbers = countDistinct(numbers);
        printNumbers(countOfDistinctNumbers, numbers);
    }

    public static int[] getNumbers() {
        //First we get numbers from user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int[] eliminateDuplicates(int[] numbers) {
        //This method seems a little bit complicated
        //I tried to get rid of duplicated numbers
        // by using this method but while doing that
        //I let the zeros stay at the end part of the list
        //because length of the list cannot be changed.
        int[] eliminatedList = new int[numbers.length];
        boolean isDuplicate;
        int indexOfEliminatedList = 0;
        for (int i = 0; i < numbers.length; i++) {
            isDuplicate = true;
            for (int j = 0; j < indexOfEliminatedList; j++) {
                if (numbers[i] == eliminatedList[j]) {
                    isDuplicate = false;
                }
            }
            if (isDuplicate) {
                eliminatedList[indexOfEliminatedList] = numbers[i];
                indexOfEliminatedList++;
            }
        }
        return eliminatedList;
    }

    public static int countDistinct(int[] numbers) {
        //I used this method to know actually
        //how many number I have other than zeros which are at
        //the last part of the list.
        int countOfZero = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 0) {
                countOfZero++;
            } else {
                break;
            }
        }
        return numbers.length - countOfZero;
    }

    public static void printNumbers(int countOfDistinctNumbers, int[] numbers) {
        //After learning the count of numbers to print
        // I print the list till this count.
        System.out.print("The distinct numbers are : ");
        for (int i = 0; i < countOfDistinctNumbers; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

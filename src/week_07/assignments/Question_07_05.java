package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        int[] distinctNumbers = getDistincts();

        int countOfNumbers = countNumbers(distinctNumbers);

        printDistinctNumbers(countOfNumbers, distinctNumbers);
    }

    public static int[] getDistincts() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] numbers = new int[10];
        int count = 1;
        //this count is for counting numbers no matter distinct or not.
        for (int i = 0; i < numbers.length; i++) {
            //first taking number.
            numbers[i] = input.nextInt();
            for (int j = 0; j < i; j++) {
                //checking if I took it before
                if (numbers[i] == numbers[j]) {
                    //if I took it, I change it with zero
                    numbers[i] = 0;
                    //and make the loop continue from same place
                    i--;
                    break;
                }
            }
            if (count == 10) {
                break;
            }
            count++;

        }
        return numbers;
    }

    public static int countNumbers(int[] numbers) {
        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static void printDistinctNumbers(int count, int[] numbers) {
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

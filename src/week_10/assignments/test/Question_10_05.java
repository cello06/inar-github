package week_10.assignments.test;

import week_10.assignments.classes.StackOfIntegers;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers(number);
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                number = number / i;
                stackOfIntegers.push(i);
                i--;
            }
        }

        printIncreasedOrder(stackOfIntegers);
        System.out.println();
        printDecreasingOrder(stackOfIntegers);


    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printIncreasedOrder(StackOfIntegers stackOfIntegers) {
        System.out.print("Increased order : ");
        for (int i = 0; i < stackOfIntegers.getSize(); i++) {
            System.out.print(stackOfIntegers.getPrimeFactors()[i] + " ");
        }
    }

    public static void printDecreasingOrder(StackOfIntegers stackOfIntegers) {
        System.out.print("Decreasing order: ");
        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}

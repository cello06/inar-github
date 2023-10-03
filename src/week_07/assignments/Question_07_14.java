package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        gcdCalculationSystem();
    }

    public static void gcdCalculationSystem() {
        int[] numbers = getNumbers();
        int gcdOfNumbers = gcd(numbers);
        printGCD(gcdOfNumbers);
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers : ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int gcd(int... numbers) {
        int minimumNumber = min(numbers);
        int gcd = 1;
        boolean isGCD;
        for (int i = 2; i < minimumNumber; i++) {
            isGCD = true;
            for (int number : numbers) {
                if (number % i != 0) {
                    isGCD = false;
                    break;
                }
            }
            if (isGCD) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int min(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static void printGCD(int gcd) {
        System.out.println("The greatest common divisor is " + gcd);
    }
}

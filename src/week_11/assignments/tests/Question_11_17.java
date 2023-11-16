package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m :");
        int m = input.nextInt();
        ArrayList<Integer> factorsOfM = getFactors(m);
        int n = getN(factorsOfM);


        System.out.println("The smallest number n for m * n " +
                "to be perfect square is " + n + "\nm * n is " + (m * n));

    }

    public static ArrayList<Integer> getFactors(int m) {
        ArrayList<Integer> primeNumbers = getPrimeNumbers();
        ArrayList<Integer> factors = new ArrayList<>();
        int indexOfPrimeNumbers = 0;
        while (m > 1) {
            if (m % primeNumbers.get(indexOfPrimeNumbers) == 0) {
                factors.add(primeNumbers.get(indexOfPrimeNumbers));
                m /= primeNumbers.get(indexOfPrimeNumbers);
            } else {
                indexOfPrimeNumbers++;
            }
        }
        return factors;
    }

    public static ArrayList<Integer> getPrimeNumbers() {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int count = 0;
        int number = 2;
        while (count <= 10) {
            if (isPrime(number)) {
                primeNumbers.add(number);
                count++;
            }
            number++;
        }
        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getN(ArrayList<Integer> factors) {
        //This method seems a little bit complicated. My purpose in here
        //is , taking only factors that their total number is odd.
        //I used 2 for loops to check list. If loops find that,
        //the total number (count) is odd then directly multiply it
        //with result.
        //But to solve some problems about last element of the list or
        //some other problems I used some "if" conditions.
        int result = 1;
        int startPoint = factors.size();
        for (int i = 0; i < factors.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < factors.size(); j++) {

                if (j == factors.size() - 1) {
                    startPoint = factors.size() - 1;
                }


                if (factors.get(i).equals(factors.get(j))) {
                    count++;
                } else {
                    startPoint = j - 1;
                    break;
                }

            }
            if (isOdd(count)) {//checking total number is odd
                result *= factors.get(i);

            }
            if (i == factors.size() - 1) {//if it on the last character
                // then no need to continue.
                break;
            }

            i = startPoint;//deciding where to start in first loop


        }
        return result;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}

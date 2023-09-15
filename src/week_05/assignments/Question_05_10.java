package week_05.assignments;

public class Question_05_10 {
    public static void main(String[] args) {

        int number = 100;

        int smallestNumberDivisibleBy5And6 = 0;

        int count = 0;

        //if a number is divisible by 5 and 6 at same time
        //it means it is also divisable by 30

        do {

            if (number % 30 == 0) {

                smallestNumberDivisibleBy5And6 = number;
                break;

            }

            number += 5;

        } while (number <= number + 30);


        for (int i = smallestNumberDivisibleBy5And6; i <= 1000; i += 30) {

            System.out.print((count % 10 == 0) ? "\n" + i + " " : i + " ");

            count++;

        }
    }
}

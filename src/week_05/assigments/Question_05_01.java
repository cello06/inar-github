package week_05.assigments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        int negative = 0;
        int positive = 0;
        double sum = 0;
        int count = 0;

        System.out.print("Enter an integer, the input ends if it is 0 : ");

        do {

            number = input.nextInt();

            if (number < 0) {

                count++;
                negative++;
                sum += number;

            } else {

                if (number != 0) {

                    count++;
                    positive++;
                }

                sum += number;
            }

        } while (number != 0);


        double average = (sum / 1.0) / count;


        if (sum == 0 && count == 0) {

            System.out.println("No numbers are entered except 0");

        } else {

            System.out.printf("The number of positives is %d\n" +
                    "The number of negatives is %d\n" +
                    "The total is %.1f\n" +
                    "The average is %.2f", positive, negative, sum, average);
        }
    }

}

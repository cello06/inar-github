package week_05.assigments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        double number = 0;
        double sumOfNumbers = 0;
        double sumOfSquareOfNumbers = 0;
        System.out.print("Enter ten numbers : ");

        do {

            number = input.nextDouble();

            sumOfNumbers += number;

            sumOfSquareOfNumbers += Math.pow(number, 2);

            count++;
        } while (count < 10);


        double mean = sumOfNumbers / count;


        double standartDeviation = Math.sqrt((sumOfSquareOfNumbers - (Math.pow(sumOfNumbers, 2)) / count) / (count - 1));


        System.out.printf("The mean is %.2f \nThe standart deviation is %.5f", mean, standartDeviation);
    }
}

package week_06.assignments;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long number = input.nextLong();

        double squareOfNumber = sqrt(number);
        System.out.printf("The approximated square root of %d is %.1f", number, squareOfNumber);
    }

    public static double sqrt(long number) {
        double nextGuess = 0;
        double lastGuess = 0;
        double approximateSquare = 1;

        do {
            lastGuess = approximateSquare;
            nextGuess = (lastGuess + number / lastGuess) / 2;
            approximateSquare = nextGuess;

        } while ((Math.abs(nextGuess - lastGuess)) >= 0.000000001E-10);

        return approximateSquare;

    }
}

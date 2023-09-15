package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxNumber = 0;
        int countMax = 0;
        int number = 0;

        System.out.println("Enter integers (it ends with input of 0) : ");

        do {
            number = input.nextInt();

            if (number > maxNumber) {
                maxNumber = number;
                countMax = 1;
            } else if (number == maxNumber) {
                countMax++;
            }

        } while (number != 0);

        System.out.printf("The largest count is %d"
                + " and the occurence of the count is %d", maxNumber, countMax);


    }
}

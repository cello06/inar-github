package week_05.assigments;

import java.util.Scanner;

public class Qustion_05_50 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String yourStr = input.nextLine();

        int numberOfUpperCase = 0;


        for (int i = 0; i <= yourStr.length() - 1; i++) {

            if (Character.isUpperCase(yourStr.charAt(i))) {

                numberOfUpperCase++;

            }
        }

        System.out.println("The number of uppercase letters is " + numberOfUpperCase);
    }
}

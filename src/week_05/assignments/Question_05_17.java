package week_05.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of line : ");
        int numberOfLines = input.nextInt();


        //firstly I tried only one space, but it was
        //very compressed
        //      1
        //     212
        //    32123
        //   4321234
        //  543212345
        // 65432123456
        //7654321234567
        //  to make it more wide I added more spaces


        for (int i = 1; i <= numberOfLines; i++) {

            for (int j = 1; j <= numberOfLines - i; j++) {

                System.out.print("   ");

            }

            for (int k = i; k >= 1; k--) {

                System.out.print(" " + k + " ");

            }

            for (int l = 2; l <= i; l++) {

                System.out.print(" " + l + " ");

            }

            System.out.println();
        }
    }
}

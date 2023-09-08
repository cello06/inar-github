package week_05.assigments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String yourStr = input.nextLine();

        String oddShapeOfYourStr = "";


        for (int i = 0; i <= yourStr.length() - 1; i++) {

            if (i % 2 == 0) {

                oddShapeOfYourStr += yourStr.charAt(i);

            }

        }

        System.out.println(oddShapeOfYourStr);
    }
}

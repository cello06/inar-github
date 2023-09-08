package week_05.assigments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String yourStr = input.nextLine();

        String newStr = "";


        int lengthOfYourStr = yourStr.length();

        int count = 0;


        while (count <= lengthOfYourStr - 1) {

            newStr = yourStr.charAt(count) + newStr;

            count++;

        }

        System.out.println("The reversed string is " + newStr);

    }
}

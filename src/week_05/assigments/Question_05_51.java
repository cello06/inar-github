package week_05.assigments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String firstStr = input.nextLine();

        System.out.print("Enter second string : ");
        String secondStr = input.nextLine();

        int indexOfEqualPrefix = 0;
        boolean isEqual = true;

        while (isEqual) {
            if (firstStr.charAt(indexOfEqualPrefix) == secondStr.charAt(indexOfEqualPrefix)) {

                indexOfEqualPrefix++;
            } else {
                isEqual = false;
            }
        }
        if (indexOfEqualPrefix > 0) {
            System.out.println("The common prefix is " + firstStr.substring(0, indexOfEqualPrefix));
        } else {
            System.out.printf("%s and %s have no common prefix ", firstStr, secondStr);
        }
    }

}

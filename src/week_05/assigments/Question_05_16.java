package week_05.assigments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String smallestFactorsOfNumber = "";

        System.out.print("Enter an integer : ");

        int number = input.nextInt();

        int divisor = 2;


        while (number != 1) {
            if (number % divisor == 0) {
                number = number / divisor;
                smallestFactorsOfNumber += divisor + ", ";
                divisor--;
            }
            divisor++;
        }

        //to change the comma with dot
        // which is in the last part of
        // smallestFactorsOfNumber
        //I used substring method
        // after I learned the index of it


        int lastIndexOfComma = smallestFactorsOfNumber.lastIndexOf(',');

        smallestFactorsOfNumber = smallestFactorsOfNumber.substring(0, lastIndexOfComma) + ".";
        
        System.out.println(smallestFactorsOfNumber);
    }
}

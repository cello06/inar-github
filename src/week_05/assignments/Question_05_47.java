package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string :");
        String stringOfISBN = input.nextLine();
        int calculationOfFirstTwelve = 0;

        if (stringOfISBN.length() != 12) {
            System.out.printf("%s is an invalid input", stringOfISBN);
        } else {
            for (int i = 0; i <= stringOfISBN.length() - 1; i++) {
                if (i % 2 == 0) {
                    calculationOfFirstTwelve += stringOfISBN.charAt(i) - '0';
                } else {
                    calculationOfFirstTwelve += 3 * (stringOfISBN.charAt(i) - '0');
                }
            }


            if (calculationOfFirstTwelve % 10 == 0) {
                stringOfISBN += "0";
            } else {
                stringOfISBN += 10 - (calculationOfFirstTwelve % 10);
            }

            System.out.println("The ISBN-13 number is " + stringOfISBN);
        }
    }
}

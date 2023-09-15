package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN : ");

        String stringOfSSN = input.nextLine();


        int firstIndexOfHypen = stringOfSSN.indexOf('-');

        int lastIndexOfHypen = stringOfSSN.lastIndexOf('-');


        String firstPartOfSSN = stringOfSSN.substring(0, firstIndexOfHypen);

        String secondPartOfSSN = stringOfSSN.substring(firstIndexOfHypen+1, lastIndexOfHypen);

        String lastPartOfSSN = stringOfSSN.substring(lastIndexOfHypen+1);


        if ((stringOfSSN.length() == 11)
                && (firstPartOfSSN.length() == 3)
                && (secondPartOfSSN.length() == 2)
                && (lastPartOfSSN.length() == 4)) {


            if ((Character.isDigit(firstPartOfSSN.charAt(0))
                    && (Character.isDigit(firstPartOfSSN.charAt(1)))
                    && (Character.isDigit(firstPartOfSSN.charAt(2)))
                    && (Character.isDigit(secondPartOfSSN.charAt(0)))
                    && (Character.isDigit(secondPartOfSSN.charAt(1)))
                    && (Character.isDigit(lastPartOfSSN.charAt(0)))
                    && (Character.isDigit(lastPartOfSSN.charAt(1)))
                    && (Character.isDigit(lastPartOfSSN.charAt(2)))
                    && (Character.isDigit(lastPartOfSSN.charAt(3))))) {


                System.out.printf("%s is a valid social security number",stringOfSSN);


            } else {

                System.out.printf("%s is an invalid social security number",stringOfSSN);

            }

        } else {

            System.out.printf("%s is an invalid social security number",stringOfSSN);

        }
    }
}

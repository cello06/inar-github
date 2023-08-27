package week_04.assigments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        String stringOfHexValue = "";
        int hexNumberBiggerThan10 = 6;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0-15) : ");

        int decimalValue = input.nextInt();

        if (decimalValue >= 0 && decimalValue <= 9) {

            stringOfHexValue = String.valueOf(decimalValue);

        } else if (decimalValue >= 10 && decimalValue <= 15) {

            hexNumberBiggerThan10 = decimalValue % 10;

        } else {

            System.out.printf("%d is an invalid input ", decimalValue);
            System.exit(1);
        }


        switch (hexNumberBiggerThan10) {
            case 0:
                stringOfHexValue = "A";
                break;
            case 1:
                stringOfHexValue = "B";
                break;
            case 2:
                stringOfHexValue = "C";
                break;
            case 3:
                stringOfHexValue = "D";
                break;
            case 4:
                stringOfHexValue = "E";
                break;
            case 5:
                stringOfHexValue = "F";
            default:
                break;
        }



        char charOfHexValue = stringOfHexValue.charAt(0);



        System.out.printf("The hex value is %c", charOfHexValue);


    }
}

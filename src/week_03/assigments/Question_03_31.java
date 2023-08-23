package week_03.assigments;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB : ");

        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa : ");

        int convertToWhat = input.nextInt();

        double dollarAmount = 0;
        double rMBAmount = 0;


        switch (convertToWhat) {
            case 0:
                System.out.print("Enter the dollar amount :");
                dollarAmount = input.nextDouble();
                rMBAmount = dollarAmount * exchangeRate;
                System.out.println("$" + dollarAmount + " is " + ((int) (rMBAmount * 100) / 100.0) + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount : ");
                rMBAmount = input.nextDouble();
                dollarAmount = rMBAmount / exchangeRate;
                System.out.println(rMBAmount + " yuan is $" + ((int) (dollarAmount * 100) / 100.0));
                break;
            default:
                System.out.println("Incorrect input");

        }

    }
}

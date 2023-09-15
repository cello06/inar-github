package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        final double MONTHLY_INTEREST_RATE = 0.05 / 12;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double firstMonth = savingAmount * (1 + MONTHLY_INTEREST_RATE);
        double secondMonth = (savingAmount + firstMonth) * (1 + MONTHLY_INTEREST_RATE);
        double thirdMonth = (savingAmount + secondMonth) * (1 + MONTHLY_INTEREST_RATE);
        double fourthMonth = (savingAmount + thirdMonth) * (1 + MONTHLY_INTEREST_RATE);
        double fifthMonth = (savingAmount + fourthMonth) * (1 + MONTHLY_INTEREST_RATE);
        double sixthMonth = (savingAmount + fifthMonth) * (1 + MONTHLY_INTEREST_RATE);
        System.out.println("After the sixth month, the account value is $" + (int)(sixthMonth*100)/100.0);


    }
}

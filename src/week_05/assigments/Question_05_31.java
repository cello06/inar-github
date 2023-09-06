package week_05.assigments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount : ");

        double depositValue = input.nextDouble();

        System.out.print("Enter annual percentage yield : ");

        double annualPercentageYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months) : ");

        int numberOfMonths = input.nextInt();


        double monthlypercentageYield = annualPercentageYield / 1200;



        System.out.printf("%-10s%10s\n", "Month", "CD Value");

        for (int i = 1; i <= numberOfMonths; i++) {

            depositValue += depositValue * monthlypercentageYield;

            System.out.printf("%-10d%10.2f\n", i, depositValue);

        }
    }
}

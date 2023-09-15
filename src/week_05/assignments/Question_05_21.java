package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double interestRate = 5;

        double monthlyInterestRate = 0;

        double monthlyPayment = 0;

        double totalPayment = 0;


        System.out.print("Loan Amount : ");

        double loanAmount = input.nextDouble();

        System.out.print("Number of Years : ");

        int numberOfYears = input.nextInt();


        System.out.println("Interest Rate   Monthly Payment   Total Payment");


        while (interestRate <= 8) {

            monthlyInterestRate = interestRate / 1200;

            monthlyPayment = ((loanAmount * monthlyInterestRate) / (1 - ((1) / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)))));

            totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%8.3f%%       %8.2f         %8.2f", interestRate, monthlyPayment, totalPayment);

            System.out.println();

            interestRate += (1.0 / 8);

        }

    }
}

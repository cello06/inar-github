package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested : ");
        double investedAmount = input.nextDouble();

        System.out.print("Annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        printFutureInvestmentValue(investedAmount, monthlyInterestRate);
    }

    public static void printFutureInvestmentValue(double investedAmount, double monthlyInterestRate) {
        System.out.printf("%-7s%-15s\n", "Years", "Future Value");

        for (int i = 1; i <= 30; i++) {
            System.out.printf("%-7d %-15.2f\n", i, futureInvestmentValue(investedAmount, monthlyInterestRate, i));
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {

        double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), (years * 12)));
        return futureInvestmentValue;
    }
}

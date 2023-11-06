package week_09.assignments.test;

import week_09.assignments.classes.Account;

public class Question_09_07 {
    public static void main(String[] args) {
        int id = 1122;
        double initialBalance = 20_000;
        double annualInterestRate = 4.5;
        double withdrawAmount = 2_500;
        double depositAmount = 3_000;

        Account account = new Account(id, initialBalance);
        account.setAnnualInterestRate(annualInterestRate);
        account.withdraw(withdrawAmount);
        account.deposit(depositAmount);

        printAccountSummary(account);
    }

    public static void printAccountSummary(Account account) {
        System.out.println("           Account Statement : ");
        System.out.println("-------------------------------------");
        System.out.println("Account ID       : " + account.getId());
        System.out.println("Date created     : " + account.getDateCreated().toString());
        System.out.printf("Balance          : $%.2f\n", account.getBalance());
        System.out.printf("Monthly Interest : $%.2f", account.getMonthlyInterest());
    }
}

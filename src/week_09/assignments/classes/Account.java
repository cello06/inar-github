package week_09.assignments.classes;

import java.util.Date;

public class Account {
    private int id;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
        dateCreated = new Date();
    }

    Account(int id, double initialBalance) {
        dateCreated = new Date();
        this.id = id;
        balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount to deposit");
        }
    }
}

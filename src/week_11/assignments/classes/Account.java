package week_11.assignments.classes;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private double balance;
    private int id;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(String name, int id, double balance,double annualInterestRate) {
        this.dateCreated = new Date();
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void withdraw(double amount) {
        Transaction transaction;
        if (this.balance > amount) {
            this.balance -= amount;
            transaction = new Transaction('W', amount, balance, "Withdraw from ATM");
            this.transactions.add(transaction);
        } else {
            System.out.println("Not enough money");
        }

    }

    public void deposit(double amount) {
        Transaction transaction;
        if (amount > 0) {
            this.balance += amount;
            transaction = new Transaction('D', amount, balance, "Deposit to Bank");
            this.transactions.add(transaction);
        } else {
            System.out.println("Invalid amount to deposit");
        }
    }
    @Override
    public String toString(){
        return "Name : " + this.name +
                "\nID : " + this.id +
                "\nBalance : " + this.balance +
                "\nAccount Creation Date : " + this.dateCreated;
    }

}

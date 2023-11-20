package week_12.assignments.classes;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        loanDate = new Date();
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
            throws IllegalArgumentException {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Annual Interest Rate must be bigger than zero!");
        } else {
            this.annualInterestRate = annualInterestRate;
        }

    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Number of years must be bigger than zero!");
        } else {
            this.numberOfYears = numberOfYears;
        }

    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan amount must be bigger than zero!");
        } else {
            this.loanAmount = loanAmount;
        }
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate / 1200;
        double monthlyPayment = this.loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, this.numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    @Override
    public String toString(){
        return "Loan Date : " + this.loanDate +
                "\nMonthly Payment : " + this.getMonthlyPayment() +
                "\nTotal Payment : " + this.getTotalPayment();
    }
}

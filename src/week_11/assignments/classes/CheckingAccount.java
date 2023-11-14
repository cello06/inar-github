package week_11.assignments.classes;

import week_09.assignments.classes.Account;

public class CheckingAccount extends Account {
    private double overDraft;

    public CheckingAccount() {

    }

    public CheckingAccount(double overDraft) {
        this.overDraft = overDraft;
    }

    public CheckingAccount
            (double overDraft, int id, double initialBalance) {
        super(id, initialBalance);
        this.overDraft = overDraft;
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() + overDraft > amount) {
            super.setBalance(getBalance() - amount);
        } else {
            System.out.println("Not enough money!");
        }
    }

    @Override
    public String toString() {
        return "ID : " + super.getId() +
                "\nBalance : $" + super.getBalance() +
                "\nLimit  is $-" + this.overDraft;
    }
}

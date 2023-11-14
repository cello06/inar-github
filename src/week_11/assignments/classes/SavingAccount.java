package week_11.assignments.classes;

import week_09.assignments.classes.Account;


public class SavingAccount extends Account {

    public SavingAccount() {

    }

    public SavingAccount(int id, double initialBalance) {
        super(id, initialBalance);
    }

    @Override
    public String toString() {
        return "ID : " + super.getId() +
                "\nBalance is $" + super.getBalance();
    }


}

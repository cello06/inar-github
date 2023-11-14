package week_11.assignments.tests;

import week_09.assignments.classes.Account;
import week_11.assignments.classes.CheckingAccount;
import week_11.assignments.classes.SavingAccount;

public class Question_11_03 {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount(16, 4820);
        Account checkingAccount = new CheckingAccount(500, 11, 1450);

        System.out.println(checkingAccount);
        System.out.println("--------------------");
        System.out.println(savingAccount);
    }
}

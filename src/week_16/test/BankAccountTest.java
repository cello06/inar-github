package week_16.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import week_16.java.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    BankAccount bankAccount;
    static int testCaseNumber = 1;

    @BeforeAll
    public static void init() {
        System.out.println("BankAccountTest is started!");

    }

    @BeforeEach
    public void setUp() {
        System.out.println("-------------TC-" + testCaseNumber + ": is started---------------");
        bankAccount = new BankAccount();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("-------------TC-" + testCaseNumber + ": is finished--------------");
        System.out.println("##############################################");
        bankAccount = null;
        testCaseNumber++;
    }

    @Test
    void testDepositIntoAccount() {
        double validValueForDeposit = 10.0;
        bankAccount.deposit(validValueForDeposit);
        double expectedBalance = validValueForDeposit;
        double actualResult = bankAccount.getBalance();
        System.out.println("TestDepositIntoAccount is test case");
        System.out.println("deposit() method called :\n" +
                "input : " + validValueForDeposit +
                "\nExpected Result : " + expectedBalance +
                "\nActual Result : " + actualResult);
        assertEquals(actualResult, expectedBalance, "There is a problem in deposit() method.");
    }

    @Test
    void testDepositNegativeAmount() {
        double negativeValueForDeposit = -10.0;
        System.out.println("TestDepositNegativeAmount is the test case");
        System.out.println("deposit() method called :\n" +
                "input : " + negativeValueForDeposit +
                "\nExpected Result : Exception must be thrown");
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(negativeValueForDeposit);
        });
        System.out.println("Actual Result : Exception is thrown");
    }

    @Test
    void testWithdrawFromAccountWithSufficientFunds() {

        double moneyAmountInAccount = 20.0;
        bankAccount.deposit(moneyAmountInAccount);
        /**
         * Firstly we need to deposit
         * money to account to test
         * withdraw() method.
         */
        double sufficientAmountToWithdraw = 15.0;
        bankAccount.withdraw(sufficientAmountToWithdraw);

        double expectedBalance = moneyAmountInAccount - sufficientAmountToWithdraw;
        double actualBalance = bankAccount.getBalance();
        System.out.println("testWithdrawFromAccountWithSufficientFunds is the test case");
        System.out.println("withdraw() method called \n" +
                "Current Balance : " + moneyAmountInAccount +
                "\ninput(sufficientMoney) : " + sufficientAmountToWithdraw +
                "\nExpected Final Balance : " + expectedBalance +
                "\nActual Final Balance : " + actualBalance);
        assertEquals(expectedBalance, actualBalance, "withdraw() method does not function properly.");
    }

    @Test
    void testWithdrawFromAccountWithExceedingFunds() {
        double amountToWithdraw = 15.0;
        System.out.println("testWithdrawFromAccountWithExceedingFunds is the test case");
        System.out.println("withdraw() method called \n" +
                "Current Balance : 0.0 " +
                "\ninput(amountToWithdraw) : " + amountToWithdraw +
                "\nExpected Case : Exception must be thrown.");

        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(amountToWithdraw);
        });
        System.out.println("Actual Case : Exception is thrown.");
    }

    @Test
    void testWithdrawFromAccountWithNegativeAmount() {
        double negativeAmountToWithdraw = -15.0;
        System.out.println("testWithdrawFromAccountWithNegativeAmount is the test case");
        System.out.println("withdraw() method called \n" +
                "Current Balance : 0.0 " +
                "\ninput(amountToWithdraw) : " + negativeAmountToWithdraw +
                "\nExpected Case : Exception must be thrown.");

        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(negativeAmountToWithdraw);
        });
        System.out.println("Actual Case : Exception is thrown.");
    }
}

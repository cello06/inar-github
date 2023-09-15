package week_03.assignments;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remamaingMoney;
        System.out.print("Enter the amount (e.g 11,56) :");
        double amountOfMoney = input.nextDouble();
        int totalValue = (int) (amountOfMoney * 100);

        int dollars = totalValue / 100;
        remamaingMoney = totalValue % 100;
        int quarters = remamaingMoney / 25;
        remamaingMoney = remamaingMoney % 25;
        int dimes = remamaingMoney / 10;
        remamaingMoney = remamaingMoney % 10;
        int nickels = remamaingMoney / 5;
        remamaingMoney = remamaingMoney % 5;
        int pennies = remamaingMoney;
        System.out.println("Your amount " + amountOfMoney + " consist of ");
        System.out.println(dollars + ((dollars > 1) ? " dollars" : " dollar"));
        System.out.println(quarters + ((quarters > 1) ? " quarters" : " quarter"));
        System.out.println(dimes + ((dimes > 1) ? " dimes" : " dime"));
        System.out.println(nickels + ((nickels > 1) ? " nickels" : " nickel"));
        System.out.println(pennies + ((pennies > 1) ? " pennies" : " penny"));
    }
}

package week_03.assigments;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1 :");
        double weightOfPackage1 = input.nextDouble();
        double priceForPackage1 = input.nextDouble();

        System.out.print("Enter weight and price for package  :");
        double weightOfPackage2 = input.nextDouble();
        double priceForPackage2 = input.nextDouble();

        //to find which price is better I divide weight to price
        double priceQualityOfPackage1 = weightOfPackage1 / priceForPackage1;
        double priceQualityOfPackage2 = weightOfPackage2 / priceForPackage2;


        if (priceQualityOfPackage1 > priceQualityOfPackage2) {
            System.out.println("Package 1 has a better price.");

        } else if (priceQualityOfPackage2 > priceQualityOfPackage1) {
            System.out.println("Package 2 has a better price.");

        } else System.out.println("Two package have the same price.");
    }
}

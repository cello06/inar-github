package week_03.assignments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double shippingCost = 0;
        System.out.print("Enter the weight of the package (in pounds) : ");
        double weightOfPackage = input.nextDouble();
        if (weightOfPackage > 0 && weightOfPackage <= 1) {
            shippingCost = weightOfPackage * 3.5;
        } else if (weightOfPackage > 1 && weightOfPackage <= 3) {
            shippingCost = weightOfPackage * 5.5;
        } else if (weightOfPackage > 3 && weightOfPackage <= 10) {
            shippingCost = weightOfPackage * 8.5;
        } else if (weightOfPackage > 10 && weightOfPackage <= 20) {
            shippingCost = weightOfPackage * 10.5;
        }
        if (weightOfPackage > 20) {
            System.out.println("The package cannot be shipped");
        } else
            System.out.println("Shipping cost of package is $" + (int) (shippingCost * 10) / 10.0);
    }
}

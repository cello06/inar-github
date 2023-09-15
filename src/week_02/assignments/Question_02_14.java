package week_02.assignments;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches:");
        double height = input.nextDouble();
        /*to calculate BodyMassIndex we need to
        convert pound to kilogram and inch to meter
         */
        double weightInKilogram = weight * 0.45359237;
        double heightInMeter = height * 0.0254;
        double bodyMassIndex = weightInKilogram / (Math.pow(heightInMeter, 2));
        System.out.println("BMI is " + (int)(bodyMassIndex*10000)/10000.0);


    }
}

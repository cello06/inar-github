package week_03.live_class;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final double POUND_TO_KG = 0.45359237;
        final double INCHE_TO_METER = 0.0254;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds : ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter your height in inches : ");
        double heightInInches = input.nextDouble();

        double weightInKilogram = weightInPounds * POUND_TO_KG;
        double heightInMeter = heightInInches * INCHE_TO_METER;
        double bodyMassIndex = weightInKilogram / (heightInMeter * heightInMeter);

        System.out.println("BMI is " + bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex < 25.0) {
            System.out.println("Normal");
        } else if (bodyMassIndex < 30.0) {
            System.out.println("Overweight");
        } else System.out.println("Obese");


    }
}

package week_03.assigments;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        final double POUND_TO_KG = 0.45359237;
        final double FEET_TO_METER = 0.3048;
        final double INCH_TO_METER = 0.0254;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double weightInPound = input.nextDouble();
        System.out.print("Enter feet : ");
        double heightInFeet = input.nextDouble();
        System.out.print("Enter inches : ");
        double heightInInch = input.nextDouble();
        double weightInKilogram = weightInPound * POUND_TO_KG;
        double heightInMeter = (heightInFeet * FEET_TO_METER) + (heightInInch * INCH_TO_METER);
        double bodyMassIndex = weightInKilogram / (Math.pow(heightInMeter, 2));

        System.out.println(bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex < 25) {
            System.out.println("Normal");
        } else if (bodyMassIndex < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }


    }
}

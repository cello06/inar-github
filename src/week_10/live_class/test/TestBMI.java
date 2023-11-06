package week_10.live_class.test;

import week_10.live_class.classes.BMI;

public class TestBMI {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());
        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}

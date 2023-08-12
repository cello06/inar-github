package week_02.assigments;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration :");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double lenght = Math.pow(speed, 2) / (2 * acceleration);
        System.out.println("The minimum runway lenght for this airplane is " + lenght);

    }
}

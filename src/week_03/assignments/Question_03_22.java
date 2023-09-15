package week_03.assignments;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coordinate1 = input.nextDouble();
        double coordinate2 = input.nextDouble();
        double distance = Math.pow(Math.pow((coordinate1 - 0), 2) + Math.pow((coordinate2 - 0), 2), 0.5);
        if (distance > 10) {
            System.out.println("Point (" + coordinate1 + "," + coordinate2 + ") is not in the circle");
        } else System.out.println("Point (" + coordinate1 + "," + coordinate2 + ") is  in the circle");
    }
}

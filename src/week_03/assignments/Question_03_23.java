package week_03.assignments;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coordinate1 = input.nextDouble();
        double coordinate2 = input.nextDouble();
        if ((Math.abs(coordinate1) <= 5) && (Math.abs(coordinate2) <= 5.0 / 2)) {
            System.out.println("Point (" + coordinate1 + "," + coordinate2 + ") is  in the rectangle");
        } else System.out.println("Point (" + coordinate1 + "," + coordinate2 + ") is not in the rectangle");
    }
}

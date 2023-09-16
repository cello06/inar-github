package week_06.assignments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle : ");

        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();
        double thirdSide = input.nextDouble();

        double area = 0;

        if (isValid(firstSide, secondSide, thirdSide)) {
            //After checking if it is valid we find area!
            area = computeArea(firstSide, secondSide, thirdSide);
            System.out.println("The area of triangle is " + area);
        } else {
            System.out.println("Invalid input !");
        }
    }

    public static boolean isValid(double firstSide, double secondSide, double thirdSide) {
        //The sum of any two sides of a triangle must be
        // greater than the length of the third side.
        //The side lengths must be positive numbers (a > 0, b > 0, c > 0)
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            if (firstSide + secondSide > thirdSide &&
                    secondSide + thirdSide > firstSide &&
                    firstSide + thirdSide > secondSide) {
                return true;
            }
        }
        return false;
    }

    public static double computeArea(double firstSide, double secondSide, double thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2;

        double area = Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
        return area;
    }
}

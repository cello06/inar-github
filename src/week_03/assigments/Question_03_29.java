package week_03.assigments;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle's center x-,y-coordinates and radius : ");
        double xOfCircle1 = input.nextDouble();
        double yOfCircle1 = input.nextDouble();
        double radiusOfCircle1 = input.nextDouble();
        System.out.print("Enter circle2 center x- y- coordinates and radius : ");
        double xOfCircle2 = input.nextDouble();
        double yOfCircle2 = input.nextDouble();
        double radiusOfCircle2 = input.nextDouble();
        double distanceBetweenCenterofTwoCircle = Math.pow(Math.pow(xOfCircle2 - xOfCircle1, 2) + Math.pow(yOfCircle2 - yOfCircle1, 2), 0.5);
        if (distanceBetweenCenterofTwoCircle + radiusOfCircle2 <= radiusOfCircle1) {
            System.out.println("circle 2 is inside circle 1");
        } else if (distanceBetweenCenterofTwoCircle > radiusOfCircle1 + radiusOfCircle2) {
            System.out.println("circle 2 does not overlap circle 1");
        } else System.out.println("circle 2 overlaps circle 1");
    }
}

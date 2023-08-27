package week_04.assigments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle : ");

        double radius = input.nextDouble();


        double xOfP1 = radius * Math.cos(Math.toRadians(90 - 72));
        double yOfP1 = radius * Math.sin(Math.toRadians(90 - 72));


        double xOfP2 = radius * Math.cos(Math.toRadians(90));
        double yOfP2 = radius * Math.sin(Math.toRadians(90));


        double xOfP3 = radius * Math.cos(Math.toRadians(90 + 72));
        double yOfP3 = radius * Math.sin(Math.toRadians(90 + 72));


        double xOfP4 = radius * Math.cos(Math.toRadians(90 + 72 + 72));
        double yOfP4 = radius * Math.sin(Math.toRadians(90 + 72 + 72));


        double xOfP5 = radius * Math.cos(Math.toRadians(90 + 72 + 72 + 72));
        double yOfP5 = radius * Math.sin(Math.toRadians(90 + 72 + 72 + 72));


        System.out.printf("The coordinates of five points on the pentagon are \n"
                        + "(%6.4f,%6.4f)\n"
                        + "(%d,%d)\n"
                        + "(%6.4f,%6.4f)\n"
                        + "(%6.4f,%6.4f)\n"
                        + "(%6.4f,%6.4f)"
                , xOfP1, yOfP1, (int) xOfP2, (int) yOfP2, xOfP3, yOfP3, xOfP4, yOfP4, xOfP5, yOfP5);

    }
}

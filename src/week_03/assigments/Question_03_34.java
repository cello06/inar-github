package week_03.assigments;

import java.util.Scanner;

public class Question_03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
        System.out.print("Enter three points for p0, p1, and p2 : ");

        double xOfP0 = input.nextDouble();

        double yOfP0 = input.nextDouble();

        double xOfP1 = input.nextDouble();

        double yOfP1 = input.nextDouble();

        double xOfP2 = input.nextDouble();

        double yOfP2 = input.nextDouble();

        if (xOfP1 < xOfP0) {
            double temp = xOfP1;
            xOfP1 = xOfP2;
            xOfP2 = temp;
            double temp2 = yOfP1;
            yOfP1 = yOfP2;
            yOfP2 = temp2;
        }


        double position = (xOfP1 - xOfP0) * (yOfP2 - yOfP0) - (xOfP2 - xOfP0) * (yOfP1 - yOfP0);

        if (position == 0) {
            if (xOfP2 < xOfP1 && xOfP2 > xOfP0) {
                System.out.println("(" + xOfP2 + ", " + yOfP2 + ") is on the line segment from (" +
                        xOfP0 + ", " + yOfP0 + ") to (" + xOfP1 + ", " + yOfP1 + ")");
            } else System.out.println("(" + xOfP2 + ", " + yOfP2 + ") is not on the line segment from (" +
                    xOfP0 + ", " + yOfP0 + ") to (" + xOfP1 + ", " + yOfP1 + ")");

        }
    }
}

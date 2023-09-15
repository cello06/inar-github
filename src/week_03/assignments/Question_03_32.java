package week_03.assignments;

import java.util.Scanner;

public class Question_03_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2 : ");
        double xOfP0 = input.nextDouble();
        double yOfP0 = input.nextDouble();
        double xOfP1 = input.nextDouble();
        double yOfP1 = input.nextDouble();
        double xOfP2 = input.nextDouble();
        double yOfP2 = input.nextDouble();

        double position = (xOfP1 - xOfP0) * (yOfP2 - yOfP0) - (xOfP2 - xOfP0) * (yOfP1 - yOfP0);
        if (position > 0) {
            System.out.println("(" + xOfP2 + ", " + yOfP2 + ") is on the left line from (" + xOfP0 + ", " + yOfP0
                    + ") to (" + xOfP1 + ", " + yOfP1+")");
        } else if (position == 0) {
            System.out.println("(" + xOfP2 + ", " + yOfP2 + ") is on the  line from (" + xOfP0 + ", " + yOfP0
                    + ") to (" + xOfP1 + ", " + yOfP1+")");
        } else
            System.out.println("(" + xOfP2 + ", " + yOfP2 + ") is on the right side of the  line from (" + xOfP0 + ", " + yOfP0
                    + ") to (" + xOfP1 + ", " + yOfP1+")");
    }
}

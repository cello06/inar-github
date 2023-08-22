package week_03.assigments;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-,y-coordinates, width and height: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        System.out.print("Enter r2's center x-, y- coordinates, width and height: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

            if ((r1X + r1Width / 2 >= r2X + r2Width/2)
                    && (r1X - r1Width / 2 <= r2X - r2Width / 2)
                    && (r1Y + r1Height / 2 >= r2Y + r2Height / 2)
                    && (r1Y - r1Height / 2 <= r2Y - r2Height / 2)) {
                System.out.println("r2 is inside r1");
            } else if ((r1X + r1Width / 2 < r2X - r1Width / 2)
                    || (r1X - r1Width / 2 > r2X + r2Width / 2)
                    || (r1Y + r1Height / 2 < r2Y - r2Height / 2)
                    || (r1Y - r1Height / 2 > r2Y + r2Height / 2)) {
                System.out.println("r2 does not overlap r1");
            } else System.out.println("r2 overlaps r1");

    }
}

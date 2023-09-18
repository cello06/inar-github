package week_06.assignments;

import java.util.Scanner;

public class Question_06_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2 : ");
        double xOfP0 = input.nextDouble();
        double yOfP0 = input.nextDouble();
        double xOfP1 = input.nextDouble();
        double yOfP1 = input.nextDouble();
        double xOfP2 = input.nextDouble();
        double yOfP2 = input.nextDouble();

        String position = findPosition(xOfP0, yOfP0, xOfP1, yOfP1, xOfP2, yOfP2);
        System.out.println(position);

    }

    public static String findPosition(double x0, double y0, double x1,
                                      double y1, double x2, double y2) {
        String position = "";
        if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
                position = "(" + x2 + "," + y2 + ") is on the line segment from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")";
            } else {
                position = "(" + x2 + "," + y2 + ") is on the same line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")";
            }
        } else if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            position = "(" + x2 + "," + y2 + ") is on the left side of the line from  (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")";
        } else {
            position = "(" + x2 + "," + y2 + ") is on the right side of the line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")";
        }
        return position;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1,
                                        double y1, double x2, double y2) {
        //According to formula we find check number
        //check number =  (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
        //
        //>0  p2 is on the left side of the line
        //=0  p2 is on the same line
        //<0  p2 is on the right side of the line
        double checkNumber = getCheckNumber(x0, y0, x1, y1, x2, y2);

        if (checkNumber == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1,
                                           double y1, double x2, double y2) {
        double checkNumber = getCheckNumber(x0, y0, x1, y1, x2, y2);

        if (checkNumber == 0) {
            if (x2 <= Math.max(x0, x1) && (x2 >= Math.min(x0, x1))
                    && y2 <= Math.max(y0, y1) && y2 >= Math.min(y0, y1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1,
                                        double y1, double x2, double y2) {
        double checkNumber = getCheckNumber(x0, y0, x1, y1, x2, y2);

        if (checkNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double getCheckNumber(double x0, double y0, double x1,
                                        double y1, double x2, double y2) {
        double checkNumber = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return checkNumber;
    }
}

package week_08.assignments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double s = getS(points);
        double area = calculateArea(s, points);
        if (area != 0) {
            printArea(area);
        } else {
            System.out.println("The three points are on the same line");
        }
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3 : ");
        double[][] points = new double[3][2];//3 is for points, 2 is for coordinates
        for (int point = 0; point < points.length; point++) {
            for (int coordinate = 0; coordinate < points[point].length; coordinate++) {
                points[point][coordinate] = input.nextDouble();
            }
        }
        return points;
    }

    public static double getS(double[][] points) {
        final double COUNT_OF_SIDE_OF_TRIANGLE = 3;
        double sumOfSide = 0;

        for (int side = 0; side < COUNT_OF_SIDE_OF_TRIANGLE; side++) {
            sumOfSide += getSide(side, points);
        }
        return sumOfSide / 2;//s = (side1+side2+side3)/2;
    }

    public static double getSide(int side, double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double sideDimension = 0;


        switch (side) {
            case 0 -> sideDimension = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            case 1 -> sideDimension = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            case 2 -> sideDimension = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            default -> {
                System.out.println("Sth wrong happen !");
                System.exit(1);
            }
        }
        return sideDimension;
    }

    public static double calculateArea(double s, double[][] points) {

        double a = s * (s - getSide(0, points)) * (s - getSide(1, points)) * (s - getSide(2, points));
        if (isOnTheSameLine(points)) {
            return 0;
        }
        return Math.sqrt(a);
    }

    public static void printArea(double area) {
        //if (area == 0) {
        //  System.out.println("The three points are on the same line");
        //} else {
        System.out.printf("The area of the triangle is %.2f", area);
        //}
    }

    public static boolean isOnTheSameLine(double[][] points) {
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];
        double x2 = points[2][0];
        double y2 = points[2][1];

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
}

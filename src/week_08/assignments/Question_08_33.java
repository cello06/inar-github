package week_08.assignments;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double[] intersectingPoint = getIntersectingPoint(points);

        double[] areas = getAreas(points, intersectingPoint);
        sort(areas);
        printAreas(areas);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");
        double[][] points = new double[4][2];
        for (int point = 0; point < points.length; point++) {
            for (int coordinate = 0; coordinate < points[coordinate].length; coordinate++) {
                points[point][coordinate] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoint = new double[2];

        double a = points[0][1] - points[2][1];
        double b = points[2][0] - points[0][0];
        double c = points[1][1] - points[3][1];
        double d = points[3][0] - points[1][0];

        double e = (a * points[0][0]) - ((-b) * points[0][1]);
        double f = (c * points[1][0]) - ((-d) * points[1][1]);

        double determinant = (a * d) - (b * c);

        if (Math.abs(determinant) < 1e-6) {
            // Lines are either parallel or coincident, handle as needed
            intersectingPoint[0] = Double.POSITIVE_INFINITY; // x-coordinate for parallel lines
            intersectingPoint[1] = Double.POSITIVE_INFINITY; // y-coordinate for parallel lines
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            intersectingPoint[0] = x;
            intersectingPoint[1] = y;
        }

        return intersectingPoint;
    }

    public static double[] getAreas(double[][] points, double[] intersectingPoint) {
        double xOfPoint1 = points[0][0];
        double yOfPoint1 = points[0][1];
        double xOfPoint2 = points[1][0];
        double yOfPoint2 = points[1][1];
        double xOfPoint3 = points[2][0];
        double yOfPoint3 = points[2][1];
        double xOfPoint4 = points[3][0];
        double yOfPoint4 = points[3][1];
        double xOfInterSec = intersectingPoint[0];
        double yOfInterSec = intersectingPoint[1];
        double area1 = getArea(xOfPoint1, yOfPoint1, xOfPoint2, yOfPoint2,xOfInterSec , yOfInterSec);
        double area2 = getArea(xOfPoint2, yOfPoint2, xOfPoint3, yOfPoint3, xOfInterSec, yOfInterSec);
        double area3 = getArea(xOfPoint3, yOfPoint3, xOfPoint4, yOfPoint4, xOfInterSec, yOfInterSec);
        double area4 = getArea(xOfPoint4, yOfPoint4, xOfPoint1, yOfPoint1, xOfInterSec, yOfInterSec);

        return new double[]{area1, area2, area3, area4};
    }

    public static double getArea
            (double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = getSide(x1, y1, x2, y2);
        double side2 = getSide(x2, y2, x3, y3);
        double side3 = getSide(x1, y1, x3, y3);

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    public static double getSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void sort(double[] areas) {
        for (int i = 0; i < areas.length - 1; i++) {
            double currentMin = areas[i];
            int indexOfCurrentMin = i;
            for (int j = i + 1; j < areas.length; j++) {
                if (currentMin > areas[j]) {
                    currentMin = areas[j];
                    indexOfCurrentMin = j;
                }
            }
            if (indexOfCurrentMin != i) {
                areas[indexOfCurrentMin] = areas[i];
                areas[i] = currentMin;
            }
        }
    }

    public static void printAreas(double[] areas) {
        System.out.print("The areas are ");
        for (double area : areas) {
            System.out.printf("%.2f ", area);
        }
    }
}

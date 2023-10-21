package week_08.assignments;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        double[][] points = getPoints();

        double[] areas = getAreas(points);
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

    public static double[] getAreas(double[][] points) {
        double xOfPoint1 = points[0][0];
        double yOfPoint1 = points[0][1];
        double xOfPoint2 = points[1][0];
        double yOfPoint2 = points[1][1];
        double xOfPoint3 = points[2][0];
        double yOfPoint3 = points[2][1];
        double xOfPoint4 = points[3][0];
        double yOfPoint4 = points[3][1];

        double area1 = getArea(xOfPoint1, yOfPoint1, xOfPoint2, yOfPoint2, xOfPoint3, yOfPoint3);
        double area2 = getArea(xOfPoint2, yOfPoint2, xOfPoint3, yOfPoint3, xOfPoint4, yOfPoint4);
        double area3 = getArea(xOfPoint3, yOfPoint3, xOfPoint4, yOfPoint4, xOfPoint1, yOfPoint1);
        double area4 = getArea(xOfPoint4, yOfPoint4, xOfPoint1, yOfPoint1, xOfPoint2, yOfPoint2);

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

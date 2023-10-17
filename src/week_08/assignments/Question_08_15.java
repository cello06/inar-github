package week_08.assignments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        printArray(points);
        sortPoint(points);// I don't know if it is necessary.
       printArray(points);
        printIfPointsOnTheSameLineOrNot(points);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points :");
        double[][] points = new double[5][2];
        for (int point = 0; point < points.length; point++) {
            for (int coordinates = 0; coordinates < points[point].length; coordinates++) {
                points[point][coordinates] = input.nextDouble();
            }
        }
        return points;
    }

    public static void sortPoint(double[][] points) {
        double[] currentMinXY = new double[2];
        for (int point = 0; point < points.length; point++) {
             currentMinXY[0] = points[point][0];
            int indexOfCurrentMinXY = point;
            for (int secondPoint = point + 1; secondPoint < points.length; secondPoint++) {
                if (currentMinXY[0] > points[secondPoint][0]) {
                    currentMinXY[0] = points[secondPoint][0];
                    currentMinXY[1] = points[secondPoint][1];
                    indexOfCurrentMinXY = secondPoint;
                }
            }
            if (indexOfCurrentMinXY != point) {
                points[indexOfCurrentMinXY][0] = points[point][0];
                points[indexOfCurrentMinXY][1] = points[point][1];
                points[point][0] = currentMinXY[0];
                points[point][1] = currentMinXY[1];
            }
        }
        for (int point = 0; point < points.length - 1; point++) {
            double currentMinY = points[point][1];
            int indexOfCurrentMinY = point;
            for (int secondPoint = point + 1; secondPoint < points.length; secondPoint++) {
                if (points[point][0] == points[secondPoint][0]) {
                    if (currentMinY > points[secondPoint][1]) {
                        currentMinY = points[secondPoint][1];
                        indexOfCurrentMinY = secondPoint;
                    }
                }
            }
            if (indexOfCurrentMinY != point) {
                points[indexOfCurrentMinY][1] = points[point][1];
                points[point][1] = currentMinY;
            }
        }

    }

    public static void printArray(double[][] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i][0] + "," + points[i][1] + ")");
        }
        System.out.println("=============");
    }

    public static void printIfPointsOnTheSameLineOrNot(double[][] points) {
        double xOfFirstPoint = points[0][0];
        double yOfFirstPoint = points[0][1];
        double xOfLastPoint = points[4][0];
        double yOfLastPoint = points[4][1];
        boolean result = true;
        //(x1-x0)*(y2-y0) - (x2-x0)*(y1-y0)  ---> needs to be "0".
        //x0 = xOfFirstPoint
        //y0 = yOfFirstPoint    // x2,y2 will be checked in loop
        //x1 = xOfLastPoint
        //y1 = yOfLastPoint

        for (int point = 1; point < points.length - 1; point++) {
            if (!isOnSameLine(xOfFirstPoint, yOfFirstPoint, xOfLastPoint, yOfLastPoint, points[point][0], points[point][1])) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "The five points are on the same line " : "The five points are not on the same line");
    }

    public static boolean isOnSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
    }
}

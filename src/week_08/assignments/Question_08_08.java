package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double closestDistance = getClosestDistance(points);
        printClosestPoints(points, closestDistance);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points : ");
        int countOfPoints = input.nextInt();
        double[][] points = new double[countOfPoints][2];
        System.out.print("Enter " + countOfPoints + " points :");
        for (int point = 0; point < points.length; point++) {
            points[point][0] = input.nextDouble();
            points[point][1] = input.nextDouble();
        }
        return points;
    }

    public static double getClosestDistance(double[][] points) {
        double closestDistance = 0;
        for (int point = 0; point < points.length - 1; point++) {
            double x1 = points[point][0];
            double y1 = points[point][1];
            for (int secondPoint = point + 1; secondPoint < points.length; secondPoint++) {
                double x2 = points[secondPoint][0];
                double y2 = points[secondPoint][1];
                double currentDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                if (point == 0) {
                    closestDistance = currentDistance;
                } else {
                    if (closestDistance > currentDistance) {
                        closestDistance = currentDistance;
                    }
                }
            }
        }
        return closestDistance;
    }

    public static void printClosestPoints(double[][] points, double closestDistance) {
        for (int point = 0; point < points.length - 1; point++) {
            double x1 = points[point][0];
            double y1 = points[point][1];
            for (int secondPoint = point + 1; secondPoint < points.length; secondPoint++) {
                double x2 = points[secondPoint][0];
                double y2 = points[secondPoint][1];
                double currentDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                if (currentDistance == closestDistance) {
                    System.out.println("The closest two points are"
                            + " (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
                }
            }
        }
        System.out.println("Their distance is " + closestDistance);
    }
}

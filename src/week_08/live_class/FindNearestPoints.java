package week_08.live_class;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        double[][] points = getPoints();
        printClosestPoints(points);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points : ");
        int countOfPoints = input.nextInt();
        System.out.print("Enter " + countOfPoints + " points :");
        double[][] points = new double[countOfPoints][2];

        for (int point = 0; point < points.length; point++) {
            for (int coordinates = 0; coordinates < points[point].length; coordinates++) {
                points[point][coordinates] = input.nextDouble();
            }
        }
        return points;
    }

    public static void printClosestPoints(double[][] points) {
        double minimumDistance = 0;
        int indexOfFirstPoint = 0;
        int indexOfSecondPoint = 0;
        double[] firstPoint = new double[2];
        double[] secondPoint = new double[2];

        for (int point = 0; point < points.length; point++) {
            firstPoint[0] = 0;
            firstPoint[1] = 0;
            secondPoint[0] = 0;
            secondPoint[1] = 0;
            for (int pointTwo = point + 1; pointTwo < points.length - 1; pointTwo++) {
                double distanceBetweenTheseTwoPoints;
                for (int coordinates = 0; coordinates < points[point].length; coordinates++) {
                    firstPoint[coordinates] = points[point][coordinates];
                    secondPoint[coordinates] = points[pointTwo][coordinates];
                }
                distanceBetweenTheseTwoPoints = getDistance(firstPoint, secondPoint);
                if (point == 1) {
                    minimumDistance = distanceBetweenTheseTwoPoints;
                } else {
                    if (distanceBetweenTheseTwoPoints < minimumDistance) {
                        minimumDistance = distanceBetweenTheseTwoPoints;
                        indexOfFirstPoint = point;
                        indexOfSecondPoint = pointTwo;
                    }
                }
            }
        }
        System.out.println("The closest two points are"
                + " (" + points[indexOfFirstPoint][0] + "," + points[indexOfFirstPoint][1] + ") and "
                + " (" + points[indexOfSecondPoint][0] + "," + points[indexOfSecondPoint][1] + ")");
    }

    public static double getDistance(double[] firstPoint, double[] secondPoint) {
        double distance;

        double x1 = firstPoint[0];
        double y1 = firstPoint[1];
        double x2 = secondPoint[0];
        double y2 = secondPoint[1];

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
}

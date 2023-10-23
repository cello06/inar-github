package week_08.assignments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double[] rightMostLowestPoint = getRightMostLowestPoint(points);
        printPoint(rightMostLowestPoint);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points :");
        double[][] points = new double[6][2];
        for (int point = 0; point < points.length; point++) {
            for (int coordinate = 0; coordinate < points[point].length; coordinate++) {
                points[point][coordinate] = input.nextDouble();
            }
        }
        return points;
    }

    public static double[] getRightMostLowestPoint(double[][] points) {
        sortAccordingToY(points);//from big to low;
        for (int point = 0; point < points.length; point++) {
            for (int secondPoint = point; secondPoint < points.length; secondPoint++) {
                if (points[point][1] == points[secondPoint][1] &&
                        points[point][0] < points[secondPoint][0]) {
                    double temp = points[point][0];
                    points[point][0] = points[secondPoint][0];
                    points[secondPoint][0] = temp;
                }
            }
        }
        return new double[]{points[0][0], points[0][1]};

    }

    public static void sortAccordingToY(double[][] points) {
        for (int point = 0; point < points.length - 1; point++) {
            double currentMinY = points[point][1];
            double currentX = points[point][0];
            int currentMinXIndex = point;
            for (int secondPoint = point + 1; secondPoint < points.length; secondPoint++) {
                if (currentMinY > points[secondPoint][1]) {
                    currentMinY = points[secondPoint][1];
                    currentX = points[secondPoint][0];
                    currentMinXIndex = secondPoint;
                }
            }
            if (currentMinXIndex != point) {
                points[currentMinXIndex][1] = points[point][1];
                points[currentMinXIndex][0] = points[point][0];
                points[point][1] = currentMinY;
                points[point][0] = currentX;
            }
        }
    }

    public static void printPoint(double[] point) {
        System.out.printf("The rightmost lowest point is (%.1f , %.1f)", point[0], point[1]);
    }
}

package week_08.assignments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        if (isParallel(points)) {
            System.out.println("The two lines are parallel");
        } else {
            double[] intersectingPoint = getIntersectingPoint(points);
            printPoint(intersectingPoint);
        }
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 :");
        double[][] points = new double[4][2];//4 -> points, 2-> x,y coordinates
        for (int point = 0; point < points.length; point++) {
            for (int coordinate = 0; coordinate < points[point].length; coordinate++) {
                points[point][coordinate] = input.nextDouble();
            }
        }
        return points;
    }


    public static boolean isParallel(double[][] points) {
        // if (ad-bc) in formula == 0, there is no intersecting point ,so it is parallel
        double a = calculateA(points);// a = y1 - y2,
        double b = calculateB(points);// b = x1 - x2,
        double c = calculateC(points);// c = y3 - y4,
        double d = calculateD(points);// d = x3 - x4,

        return a * d - b * c == 0;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoints = new double[2];
        //(e*d - b*f)/(a*d - b*c) --> x
        //(a*f - e*c)/(a*d - b*c) --> y
        double x = ((calculateE(points) * calculateD(points)) - (calculateB(points) * calculateF(points)))
                / ((calculateA(points) * calculateD(points)) - (calculateB(points) * calculateC(points)));
        double y = ((calculateA(points) * calculateF(points)) - (calculateE(points) * calculateC(points)))
                / ((calculateA(points) * calculateD(points)) - (calculateB(points) * calculateC(points)));
        intersectingPoints[0] = x;
        intersectingPoints[1] = y;
        return intersectingPoints;
    }

    public static double calculateA(double[][] points) {
        return points[0][1] - points[1][1];// a = y1 - y2,
    }

    public static double calculateB(double[][] points) {
        return points[0][0] - points[1][0];// b = x1 - x2,
    }

    public static double calculateC(double[][] points) {
        return points[2][1] - points[3][1];// c = y3 - y4,
    }

    public static double calculateD(double[][] points) {
        return points[2][0] - points[3][0];// d = x3 - x4,
    }

    public static double calculateE(double[][] points) {
        //e = (y1-y2)*x1-(x1-x2)*y1     --> a*x1 - b*y1
        //y1-y2 = a -> calculateA()
        //x1-x2 = b -> calculateB()
        return (calculateA(points) * points[0][0]) - (calculateB(points) * points[0][1]);
    }

    public static double calculateF(double[][] points) {
        //f = (y3-y4)*x3-(x3-x4)*y3     --> c*x3 - d*y3
        //y3-y4 = c -> calculateC()
        //x3-x4 = d -> calculateD()
        return (calculateC(points) * points[2][0]) - (calculateD(points) * points[2][1]);
    }

    public static void printPoint(double[] intersectingPoint) {
        System.out.printf("The intersecting point is at (%.4f,%.4f)", intersectingPoint[0], intersectingPoint[1]);
    }
}

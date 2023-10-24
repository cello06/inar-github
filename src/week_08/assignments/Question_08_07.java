package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        double[][] closestTwoPoint = new double[2][3];
        findClosestPoints(points, closestTwoPoint);
        print(closestTwoPoint);

    }

    public static void findClosestPoints(double[][] points, double[][] closestTwoPoints) {
        double closestDistance = Double.MAX_VALUE;
        for (int firstPoint = 0; firstPoint < points.length - 1; firstPoint++) {
            for (int otherPoint = firstPoint + 1; otherPoint < points.length; otherPoint++) {

                double currentDistance = findDistance(firstPoint, otherPoint, points);
                if (currentDistance < closestDistance) {
                    closestDistance = currentDistance;
                    closestTwoPoints[0][0] = points[firstPoint][0];
                    closestTwoPoints[0][1] = points[firstPoint][1];
                    closestTwoPoints[0][2] = points[firstPoint][2];
                    closestTwoPoints[1][0] = points[otherPoint][0];
                    closestTwoPoints[1][1] = points[otherPoint][1];
                    closestTwoPoints[1][2] = points[otherPoint][2];
                }
            }
        }
    }

    public static double findDistance(int firstPoint, int otherPoint, double[][] points) {
        return Math.sqrt(Math.pow(points[otherPoint][0] - points[firstPoint][0], 2) +
                Math.pow(points[otherPoint][1] - points[firstPoint][1], 2) +
                Math.pow(points[otherPoint][2] - points[firstPoint][2], 2));
    }

    public static void print(double[][] closestTwoPoints) {
        System.out.print("The closest two points are ("
                + closestTwoPoints[0][0] + "," + closestTwoPoints[0][1] + "," + closestTwoPoints[0][2] + ") and (" +
                closestTwoPoints[1][0] + "," + closestTwoPoints[1][1] + "," + closestTwoPoints[1][2] + ")");
    }
}

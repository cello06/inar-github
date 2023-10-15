package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        printClosestPoints(points);

    }

    public static void printClosestPoints(double[][] points) {
        double shortestDistance = 0;
        double resultX1 = 0;
        double resultY1 = 0;
        double resultZ1 = 0;
        double resultX2 = 0;
        double resultY2 = 0;
        double resultZ2 = 0;
        for (int row = 0; row < points.length - 1; row++) {
            double x1 = points[row][0];
            double y1 = points[row][1];
            double z1 = points[row][2];
            for (int secondRow = row + 1; secondRow < points.length; secondRow++) {
                double x2 = points[secondRow][0];
                double y2 = points[secondRow][1];
                double z2 = points[secondRow][2];

                double currentDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));

                if (row == 0) {
                    shortestDistance = currentDistance;
                } else {
                    if (shortestDistance > currentDistance) {
                        shortestDistance = currentDistance;
                        resultX1 = x1;
                        resultY1 = y1;
                        resultZ1 = z1;
                        resultX2 = x2;
                        resultY2 = y2;
                        resultZ2 = z2;
                    }
                }
            }

        }
        System.out.println("The closest 2 points are"
                + " (" + resultX1 + "," + resultY1 + "," + resultZ1 + ") and "
                + " (" + resultX2 + "," + resultY2 + "," + resultZ2 + ")");
        System.out.printf("Distance : %.2f", shortestDistance);
    }
}

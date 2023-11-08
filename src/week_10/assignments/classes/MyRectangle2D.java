package week_10.assignments.classes;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D
            (double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public boolean contains(double x, double y) {
        double rightSideOfRectangular = this.x + width / 2;
        double leftSideOfRectangular = this.x - width / 2;
        double upSideOfRectangular = this.y + height / 2;
        double downSideOfRectangular = this.x - height / 2;

        return x > leftSideOfRectangular
                && x < rightSideOfRectangular
                && y > downSideOfRectangular
                && y < upSideOfRectangular;
    }

    public boolean contains(MyRectangle2D r) {
        //all corners of Rectangular r
        // corner1x = r.getX() - r.getWidth()/2;
        // corner1y = r.getY() + r.getHeight()/2; ...
        double[][] coordinatesOfCorners = getCorners(r);
        int count = 0;
        for (int corners = 0; corners < coordinatesOfCorners.length; corners++) {
            if (this.contains(coordinatesOfCorners[corners][0], coordinatesOfCorners[corners][1])) {
                count++;
            }
        }
        return count == 4;
    }

    public boolean overlaps(MyRectangle2D r) {
        double rightSideOfRectangular = this.x + width / 2;
        double leftSideOfRectangular = this.x - width / 2;
        double upSideOfRectangular = this.y + height / 2;
        double downSideOfRectangular = this.x - height / 2;

        double rightSideOfR = r.getX() + r.getWidth() / 2;
        double leftSideOfR = r.getX() - r.getWidth() / 2;
        double upSideOfR = r.getY() + r.getHeight() / 2;
        double downSideOfR = r.getY() - r.getHeight() / 2;

        if (upSideOfRectangular < downSideOfR
                || downSideOfRectangular > upSideOfR
                || rightSideOfRectangular < leftSideOfR
                || leftSideOfRectangular > rightSideOfR) {
            return false;
        }
        return true;
    }

    public static double[][] getCorners(MyRectangle2D r) {
        double[][] corners = new double[4][2];
        corners[0][0] = r.getX() - r.getWidth() / 2;
        corners[0][1] = r.getX() + r.getHeight() / 2;
        corners[1][0] = r.getX() - r.getWidth() / 2;
        corners[1][1] = r.getX() - r.getHeight() / 2;
        corners[2][0] = r.getX() + r.getWidth() / 2;
        corners[2][1] = r.getX() + r.getHeight() / 2;
        corners[3][0] = r.getX() + r.getWidth() / 2;
        corners[3][1] = r.getX() - r.getHeight() / 2;
        return corners;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = getMinX(points);
        double maxX = getMaxX(points);
        double minY = getMinY(points);
        double maxY = getMaxY(points);
        double centerX;
        double centerY;
        double width ;
        double height;

        if (minX < 0 && maxX > 0) {
            width = Math.abs(minX) + Math.abs(maxX);
            centerX = minX + width / 2;

        } else {
            width = Math.abs(maxX) - Math.abs(minX);
            centerX = minX + width / 2;
        }
        if (minY < 0 && maxY > 0) {
            height = Math.abs(minY) + Math.abs(maxY);
            centerY = minY + height / 2;
        } else {
            height = Math.abs(maxY) - Math.abs(minY);
            centerY = minY + height / 2;
        }
        return new MyRectangle2D(centerX, centerY, width, height);
    }

    public static double getMinX(double[][] points) {
        double min = points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < min) {
                min = points[i][0];
            }
        }
        return min;
    }

    public static double getMaxX(double[][] points) {
        double max = points[0][0];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > max) {
                max = points[i][0];
            }
        }
        return max;
    }

    public static double getMinY(double[][] points) {
        double min = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < min) {
                min = points[i][1];
            }
        }
        return min;
    }

    public static double getMaxY(double[][] points) {
        double max = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] > max) {
                max = points[i][1];
            }
        }
        return max;
    }
}

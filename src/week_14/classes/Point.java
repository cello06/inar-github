package week_14.classes;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

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

    public Point() {
        this(1, 1);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x > o.getX()) {
            return 1;
        } else if (this.x == o.getX()) {
            if (this.y > o.getY()) {
                return 1;
            } else if (this.y == o.getY()) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", this.x) + " - "
                + String.format("%.2f", this.y) + ")";
    }
}

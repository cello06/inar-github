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
    public boolean overlaps(MyRectangle2D r){
        double rightSideOfRectangular = this.x + width / 2;
        double leftSideOfRectangular = this.x - width / 2;
        double upSideOfRectangular = this.y + height / 2;
        double downSideOfRectangular = this.x - height / 2;

        double rightSideOfR = r.getX() + r.getWidth() / 2;
        double leftSideOfR = r.getX() - r.getWidth() / 2;
        double upSideOfR = r.getY() + r.getHeight() / 2;
        double downSideOfR = r.getY() - r.getHeight() / 2;

        if(upSideOfRectangular < downSideOfR
                || downSideOfRectangular > upSideOfR
                || rightSideOfRectangular < leftSideOfR
                || leftSideOfRectangular > rightSideOfR){
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
}

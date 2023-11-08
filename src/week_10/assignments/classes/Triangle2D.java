package week_10.assignments.classes;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this(new MyPoint(0, 0),
                new MyPoint(1, 1),
                new MyPoint(2, 5));
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public double getArea() {
        double side1 = this.p1.distance(this.p2);
        double side2 = this.p1.distance(this.p3);
        double side3 = this.p2.distance(this.p3);

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        double side1 = this.p1.distance(this.p2);
        double side2 = this.p1.distance(this.p3);
        double side3 = this.p2.distance(this.p3);

        return side1 + side2 + side3;
    }

    public boolean contains(MyPoint p) {
        //if point is always on the right side or always
        //on the left side then it is in the triangle
        String placeOfPAccordingToSide1 = findPlace(p, this.p1, this.p2);
        String placeOfPAccordingToSide2 = findPlace(p, this.p2, this.p3);
        String placeOfPAccordingToSide3 = findPlace(p, this.p3, this.p1);

        return placeOfPAccordingToSide1.equals(placeOfPAccordingToSide2) &&
                placeOfPAccordingToSide1.equals(placeOfPAccordingToSide3);
    }

    public static String findPlace(MyPoint p1, MyPoint p2, MyPoint p3) {
        double x = p1.getX();
        double y = p1.getY();
        double x1 = p2.getX();
        double y1 = p2.getY();
        double x2 = p3.getX();
        double y2 = p3.getY();

        double placeOfP1 = (x - x2) * (y1 - y2) - (x1 - x2) * (y - y2);

        if (placeOfP1 == 0) {
            return "onLine";
        }
        if (placeOfP1 > 0) {
            return "left";
        } else {
            return "right";
        }
    }

    public boolean contains(Triangle2D t) {
        MyPoint[] points = {t.getP1(), t.getP2(), t.getP3()};

        int count = 0;
        for (int i = 0; i < points.length; i++) {
            if (this.contains(points[i])) {
                count++;
            }
        }
        return count == 3;
    }

    public boolean overlaps(Triangle2D t) {
        MyPoint[] pointsOfT = {t.getP1(), t.getP2(), t.getP3()};
        MyPoint[] pointsOfThisTriangle = {this.p1, this.p2,this.p3};

        int countAccordingToSecondTriangle = 0;
        for (int i = 0; i < pointsOfT.length; i++) {
            if (this.contains(pointsOfT[i])) {
                countAccordingToSecondTriangle++;
            }
        }
        int countAccordingToFirstTriangle = 0;
        for (int i = 0; i < 3; i++) {
            if(t.contains(pointsOfThisTriangle[i])){
               countAccordingToFirstTriangle++;
            }
        }
        return ((countAccordingToSecondTriangle > 0
                && countAccordingToSecondTriangle < 3)) ||
                ((countAccordingToFirstTriangle > 0)
                        && (countAccordingToFirstTriangle < 3));
    }

}

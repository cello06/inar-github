package week_12.assignments.classes;

import week_11.assignments.classes.GeometricObject;

public class Triangle  {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle
            (double side1, double side2, double side3)
            throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

            if (this.side1 + this.side2 < this.side3 ||
                    this.side2 + this.side3 < this.side1 ||
                    this.side1 + this.side3 < this.side2) {
                throw new IllegalTriangleException();
            }

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) *
                (s - side2) * (s - side3), 0.5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle :  side1 = " + this.side1 +
                ", side2 = " + this.side2 + ", side3 : " + this.side3 +
                "\nArea : " + this.getArea() +
                "\nPerimeter : " + this.getPerimeter();
    }
}

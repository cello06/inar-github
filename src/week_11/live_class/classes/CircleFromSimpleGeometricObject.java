package week_11.live_class.classes;

public class CircleFromSimpleGeometricObject
        extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject() {

    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject
            (double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    public void printCircle() {
        System.out.println("The circle is created " +
                getDateCreated() + "and the radius is " + radius);
    }
}

package week_13.assignments.classes;

public class Octagon extends GeometricObject implements Cloneable {

    private double side;

    public Octagon() {
        this(1);
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public double getArea() {
        return (2 + 4 * Math.pow(2, 0.5)) * this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 8 * this.side;
    }

    @Override
    public String toString() {
        return "Area  : " + this.getArea() +
                "\nPerimeter  : " + this.getPerimeter();
    }

    @Override
    public boolean equals(Object o) {
        return this.getArea() == ((Octagon) o).getArea();
    }
}

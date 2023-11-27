package week_13.assignments.classes;

public class Rectangle_10 extends GeometricObject {

    private double width;
    private double height;

    public Rectangle_10() {
        this(1, 1);
    }

    public Rectangle_10(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle_10(double width, double height, String color, boolean isFilled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(isFilled);
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

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle_10) {
            return this.getArea() == ((Rectangle_10) o).getArea();
        } else {
            System.out.println("Wrong instance!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Area : " + this.getArea();
    }
}

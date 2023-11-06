package week_09.assignments.classes;

public class Rectangle {
    public double width = 1;

    public double height = 1;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
}

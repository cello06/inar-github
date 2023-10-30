package week_09.assignments;

public class Rectangle {
    double width = 1;

    double height = 1;

    Rectangle() {
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (height + width);
    }
}

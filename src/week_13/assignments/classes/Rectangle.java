package week_13.assignments.classes;

public class Rectangle extends GeometricObjectNotAbstract {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        return 2 * (this.height + this.width);
    }
    @Override
    public String toString(){
        return "It is created on " + super.getWhenCreated() +
                "\nColor : " + super.getColor() +
                "\nIs filled : " + super.isFilled() +
                "\nWidth : " + this.getWidth() +
                "\nHeight : "+ this.getHeight() +
                "\nArea : " + this.getArea() +
                "\nPerimeter : "+ this.getPerimeter();
    }
}

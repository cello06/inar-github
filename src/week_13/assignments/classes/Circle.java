package week_13.assignments.classes;

public class Circle extends GeometricObjectNotAbstract {
    private double radius;

    public Circle(){
        this(1);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return  Math.PI * Math.pow(this.radius,2);
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString(){
        return "It is created on "+super.getWhenCreated() +
                "\nColor : " + super.getColor() +
                "\nIs filled: " + super.isFilled() +
                "\nRadius : " + this.radius +
                "\nArea : " + this.getArea() +
                "\nPerimeter : " + this.getPerimeter();
    }
}

package week_13.assignments.classes;

public class Circle_09 extends GeometricObject{
    private double radius;
    public Circle_09(){
        this(1);
    }
    public Circle_09(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o){
        return this.getRadius() == ((Circle_09) o).getRadius();
    }



    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString(){
        return "radius : "+radius;
    }
}

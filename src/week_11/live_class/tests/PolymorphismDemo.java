package week_11.live_class.tests;

import week_11.live_class.classes.CircleFromSimpleGeometricObject;
import week_11.live_class.classes.RectangleFromSimpleGeometricObject;
import week_11.live_class.classes.SimpleGeometricObject;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    public static void displayObject(SimpleGeometricObject o) {
        System.out.println("Created on " + o.getDateCreated() +
                ". Color is " + o.getColor());
        if (o instanceof CircleFromSimpleGeometricObject) {
            System.out.println("The perimeter of circle is " + (((CircleFromSimpleGeometricObject) o).getPerimeter()));
            System.out.println("The area of circle is " + (((CircleFromSimpleGeometricObject) o).getArea()));

        }
        if(o instanceof RectangleFromSimpleGeometricObject){
            System.out.println("The perimeter of rectangular is "+ ((RectangleFromSimpleGeometricObject) o).getPerimeter());
            System.out.println("The are of rectangular is "+((RectangleFromSimpleGeometricObject) o).getArea());
        }
        
    }
}

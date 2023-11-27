package week_13.assignments.tests;

import week_12.assignments.classes.IllegalTriangleException;
import week_13.assignments.classes.Circle;
import week_13.assignments.classes.GeometricObject;
import week_13.assignments.classes.Square;
import week_13.assignments.classes.Triangle;
import week_13.assignments.interfaces.Colorable;

public class Question_13_07 {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Triangle(3, 4, 5);
        geometricObjects[1] = new Triangle(6, 8, 10);
        geometricObjects[2] = new Triangle(7, 24, 25);
        geometricObjects[3] = new Square(2);
        geometricObjects[4] = new Square(6);

        for (int i = 0; i < geometricObjects.length; i++) {

            System.out.println("Area of Geometric Object in the index " + i + " is : "
                    + geometricObjects[i].getArea());
            if (geometricObjects[i] instanceof Colorable) {
                ((Colorable) geometricObjects[i]).howToColor();
            }
        }


    }
}

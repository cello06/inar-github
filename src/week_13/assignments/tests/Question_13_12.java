package week_13.assignments.tests;

import week_12.assignments.classes.IllegalTriangleException;
import week_13.assignments.classes.*;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Rectangle_10(4, 5);
        geometricObjects[1] = new Circle_09(5);
        geometricObjects[2] = new Circle_09(5);
        geometricObjects[3] = new Rectangle_10(5, 2);

        System.out.println("Total area of Geometric Objects : " + sumArea(geometricObjects));

    }

    public static double sumArea(GeometricObject[] geometricObjects) {
        double totalArea = 0;
        for (int i = 0; i < geometricObjects.length; i++) {
            totalArea += geometricObjects[i].getArea();
        }
        return totalArea;
    }
}

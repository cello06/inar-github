package week_09.assignments.test;

import week_09.assignments.classes.RegularPolygon;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("First RegularPolygon perimeter is :" + regularPolygon1.getPerimeter() + "   area is : " + regularPolygon1.getArea());
        System.out.println("Second RegularPolygon perimeter is :" + regularPolygon2.getPerimeter() + "   area is : " + regularPolygon2.getArea());
        System.out.println("Third RegularPolygon perimeter is :" + regularPolygon3.getPerimeter() + "   area is : " + regularPolygon3.getArea());
    }
}

package week_04.assignments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lenght from the center to vertex : ");

        double lenghtFromCenterToVertex = input.nextDouble();


        double side = 2 * lenghtFromCenterToVertex * Math.sin(Math.PI / 5);


        double areaOfPentagon = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));


        System.out.printf("The area of the pentegon is %4.2f", areaOfPentagon);
    }
}

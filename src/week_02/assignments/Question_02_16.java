package week_02.assignments;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double side = input.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + (int)(area*10000)/10000.0);
    }
}

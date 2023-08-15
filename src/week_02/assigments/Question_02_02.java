package week_02.assigments;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[] args) {
        final double PI=3.14159265;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius and lenght of a cylinder: ");
        double radius=input.nextDouble();
        double lenght=input.nextDouble();
        double area=Math.pow(radius,2)*PI;
        double volume=area*lenght;

        System.out.println("The area is "+(int)(area*10000)/10000.0);
        System.out.println("The volume is "+(int)(volume*10)/10.0);
    }
}

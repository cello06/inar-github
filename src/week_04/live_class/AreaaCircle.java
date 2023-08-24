package week_04.live_class;

import java.util.Scanner;

public class AreaaCircle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter radius : ");

        double radius= input.nextDouble();
        double area=Math.PI*Math.pow(radius,2);

        System.out.println(area);

        System.out.println(Math.ceil(area));
        System.out.println(Math.floor(area));
        System.out.println(Math.round(area));

    }
}

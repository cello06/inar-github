package week_03.assigments;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double coordinatesX = input.nextDouble();
        double coordinatesY = input.nextDouble();
        /* Üçgenin köşeleri A, B ve C olarak belirlensin, kontrol etmek
        istediğiniz nokta da P olsun. Eğer üçgen ABC'nin alanı, üçgenler
        ABP, ACP ve BCP'nin alanlarının toplamına eşitse, nokta
        P üçgen ABC'nin içindedir. Bu alan hesaplamaları, üçgenlerin köşe
         koordinatlarını kullanarak yapılır.
         */
        double xOfPointA = 0;
        double yOfPointA = 100;
        double xOfPointB = 0;
        double yOfPointB = 0;
        double xOfPointC = 200;
        double yOfPointC = 0;
        /*Koordinatları bilinen üç noktanın oluşturduğu
        üçgenin alanı şöyle hesaplanır;
        ALAN= 1/2|x1(y2-y3)+x2(y3-y1)+x3(y1-y2)|;
        veya ALAN=|(x1-x3)*(y2-y1)-(x1-x2)*(y3-y1)|/2;
         */
        double areaOfABC = Math.abs((xOfPointA - xOfPointC) * (yOfPointB - yOfPointA) - (xOfPointA - xOfPointB) * (yOfPointC - yOfPointA)) / 2;
        double areaOfACP = Math.abs((xOfPointA - coordinatesX) * (yOfPointB - yOfPointA) - (xOfPointA - xOfPointB) * (coordinatesY - yOfPointA)) / 2;
        double areaOfABP = Math.abs((xOfPointA - coordinatesX) * (yOfPointC - yOfPointA) - (xOfPointA - xOfPointC) * (coordinatesY - yOfPointA)) / 2;
        double areaOfBCP = Math.abs((xOfPointB - coordinatesX) * (yOfPointC - yOfPointB) - (xOfPointB - xOfPointC) * (coordinatesY - yOfPointB)) / 2;
        if (Math.abs(areaOfABC - (areaOfABP + areaOfACP + areaOfBCP)) < 1e-6) {
            System.out.println("The point is in the triangle");
        } else System.out.println("The point is not in the triangle");
    }
}

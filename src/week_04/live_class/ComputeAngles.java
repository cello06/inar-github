package week_04.live_class;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points : ");


        double xOfPointA = input.nextDouble();

        double yOfPointA = input.nextDouble();

        double xOfPointB = input.nextDouble();

        double yOfPointB = input.nextDouble();

        double xOfPointC = input.nextDouble();

        double yOfPointC = input.nextDouble();


        double distanceBetweenAandB = Math.sqrt(Math.pow(xOfPointA - xOfPointB, 2) + Math.pow(yOfPointA - yOfPointB, 2));

        double distanceBetweenBndC = Math.sqrt(Math.pow(xOfPointB - xOfPointC, 2) + Math.pow(yOfPointB - yOfPointC, 2));

        double distanceBetweenAndC = Math.sqrt(Math.pow(xOfPointA - xOfPointC, 2) + Math.pow(yOfPointA - yOfPointC, 2));


        double angleA = Math.toDegrees(Math.acos((Math.pow(distanceBetweenBndC, 2)
                - Math.pow(distanceBetweenAndC, 2)
                - Math.pow(distanceBetweenAandB, 2)) /
                (-2 * distanceBetweenAndC * distanceBetweenAandB)));


        double angleB = Math.toDegrees(Math.acos((Math.pow(distanceBetweenAndC, 2)
                - Math.pow(distanceBetweenBndC, 2)
                - Math.pow(distanceBetweenAandB, 2)) /
                (-2 * distanceBetweenBndC * distanceBetweenAandB)));


        double angleC = Math.toDegrees(Math.acos((Math.pow(distanceBetweenAandB, 2)
                - Math.pow(distanceBetweenAndC, 2)
                - Math.pow(distanceBetweenBndC, 2)) /
                (-2 * distanceBetweenBndC * distanceBetweenAndC)));

        System.out.printf("The three angles are A = %2.2f B = %2.2f C = %2.2f", Math.round(angleA*100)/100.0, Math.round(angleB*100)/100.0, Math.round(angleC*100)/100.0);

    }
}

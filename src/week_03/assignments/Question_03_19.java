package week_03.assignments;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle: ");
        double firstEdge = input.nextDouble();
        double secondEdge = input.nextDouble();
        double thirdEdge = input.nextDouble();
        double perimeter = firstEdge + secondEdge + thirdEdge;
        if ((firstEdge + secondEdge > thirdEdge)
                && (secondEdge + thirdEdge > firstEdge)
                && (firstEdge + thirdEdge > secondEdge)) {
            System.out.println("Perimeter is " + perimeter);
        } else System.out.println("The input is invalid");
    }
}

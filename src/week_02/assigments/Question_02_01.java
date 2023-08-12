package week_02.assigments;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius: ");
        double degree = input.nextDouble();
        double convertedValue = (9.0 / 5) * degree + 32;

        System.out.println(degree + " Celcius is " + convertedValue + " Fahrenheit");
    }
}

package week_04.assigments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city : ");

        String firstCity = input.nextLine();

        System.out.print("Enter the second city : ");

        String secondCity = input.nextLine();

        System.out.print("Enter the third city : ");

        String thirdCity = input.nextLine();



        if ((firstCity.compareTo(secondCity) < 0)
                && (secondCity.compareTo(thirdCity) < 0)) {

            System.out.printf("The three cities in alphabetical order are %s %s %s",
                    firstCity, secondCity, thirdCity);

        } else if ((firstCity.compareTo(secondCity) < 0)
                && (thirdCity.compareTo(secondCity) < 0)
                && (firstCity.compareTo(thirdCity) < 0)) {

            System.out.printf("The three cities in alphabetical order are %s %s %s",
                    firstCity, thirdCity, secondCity);

        } else if ((secondCity.compareTo(firstCity) < 0)
                && (firstCity.compareTo(thirdCity) < 0)) {

            System.out.printf("The three cities in alphabetical order are %s %s %s",
                    secondCity, firstCity, thirdCity);

        } else if ((secondCity.compareTo(firstCity) < 0)
                && (thirdCity.compareTo(firstCity) < 0)
                && (secondCity.compareTo(thirdCity) < 0)) {

            System.out.printf("The three cities in alphabetical order are %s %s %s",
                    secondCity, thirdCity, firstCity);

        } else if ((thirdCity.compareTo(firstCity) < 0)
                && (firstCity.compareTo(secondCity) < 0)) {

            System.out.printf("The three cities in alphabetical order are %s %s %s",
                    thirdCity, firstCity, secondCity);

        } else if ((thirdCity.compareTo(firstCity) < 0)
                && (secondCity.compareTo(firstCity) < 0)
                && (thirdCity.compareTo(secondCity) < 0)) {

            System.out.printf("The three cities in alphabetical order are %s %s %s",
                    thirdCity, secondCity, firstCity);


        } else {

            System.out.println("Smoething wrong happen maybe you enter the " +
                    "same cities !!");
            System.exit(1);

        }
    }
}
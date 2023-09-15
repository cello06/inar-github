package week_03.assignments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit " +
                "between -58ºF and 41ºF:");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) " +
                "in miles per hour: ");
        double windSpeed = input.nextDouble();
        /* The formula of the calculation of wind-chill
        temperature
        Temp.wind_chill=
        35.74 + (0.6215*temp.outside)*wind_speed^0.16 + 0.4275*wind_speed^0.16
         */


        double windChill = 35.74 + (0.6215 * temperature) -
                (35.75 * Math.pow(windSpeed, 0.16)) +
                (0.4275 * temperature * Math.pow(windSpeed, 0.16));

        if (temperature >= -58 && temperature <= 41) {
            if (windSpeed >= 2) {
                System.out.println("The wind chill index is " + (float) windChill);
            } else System.out.println("The wind speed is invalid ");
        } else
            System.out.println((windSpeed >= 2) ? "The temperature is invalid" : "The temperature and The wind speed is invalid ");

    }
}

package week_08.live_class;

import java.util.Scanner;

public class Whether {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] data
                = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);

        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }

        for (int day = 0; day < data.length; day++) {
            double sumOfTemperature = 0;
            double sumOfHumidity = 0;
            for (int hour = 0; hour < data[day].length; hour++) {
                sumOfTemperature += data[day][hour][0];
                sumOfHumidity += data[day][hour][1];
            }
            System.out.println("Day " + (day + 1) + "'s average temperature is " + (sumOfTemperature / NUMBER_OF_HOURS));
            System.out.println("Day " + (day + 1) + "'s average humidity is " + (sumOfHumidity / NUMBER_OF_HOURS));

        }

    }
}

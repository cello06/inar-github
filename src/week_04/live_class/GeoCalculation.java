package week_04.live_class;

import java.util.Scanner;

public class GeoCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double atlantaX = input.nextDouble();
        double atlantaY = input.nextDouble();
        double charlotteX = input.nextDouble();
        double charlotteY = input.nextDouble();
        double savannahX = input.nextDouble();
        double savannahY = input.nextDouble();

        double dastanceAtlantaToCharlotte = Math.sqrt(Math.pow(atlantaX - charlotteX, 2) +
                Math.pow(charlotteY - atlantaY, 2));

        double dastanceCharlotteToSavannah = Math.sqrt(Math.pow( charlotteX -savannahX, 2) +
                Math.pow(savannahY - charlotteY, 2));

        double dastanceAtlantaToSavannah = Math.sqrt(Math.pow(atlantaX - savannahX, 2) +
                Math.pow(savannahY - atlantaY, 2));

    }
}

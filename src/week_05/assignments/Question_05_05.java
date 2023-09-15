package week_05.assignments;

public class Question_05_05 {
    public static void main(String[] args) {

        int kilograms;

        double kilogramsToPounds;

        int pounds = 20;

        double poundsToKilograms;


        System.out.println("Kilograms    Pounds     " +
                " |     Pounds     Kilograms");



        for (kilograms = 1; kilograms <= 199; kilograms++) {

            kilogramsToPounds = kilograms * 2.2;

            poundsToKilograms = pounds/2.2;

            if (pounds<=515) {

                System.out.printf("%-8d   %8.1f      |     %-8d    %8.2f\n"
                        , kilograms, kilogramsToPounds, pounds, poundsToKilograms);

            }else {

                System.out.printf("%-8d   %8.1f \n",kilograms,kilogramsToPounds);

            }

            pounds=pounds+5;
        }
    }
}

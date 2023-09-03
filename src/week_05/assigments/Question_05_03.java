package week_05.assigments;

public class Question_05_03 {
    public static void main(String[] args) {

        int kilograms=1;

        double pound ;

        System.out.println("Kilograms    Pounds");

        while (kilograms<=199){

            pound  = kilograms*2.2;

            System.out.printf("%-8d      %5.1f",kilograms,pound);

            System.out.println();

            kilograms+=2;
        }
    }
}

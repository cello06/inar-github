package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {

        int kilograms=1;

        double pound ;

        System.out.printf("%-10s%10s\n","Kilograms","Pounds");

        while (kilograms<=199){

            pound  = kilograms*2.2;

            System.out.printf("%-10d%10.1f",kilograms,pound);

            System.out.println();

            kilograms+=2;
        }
    }
}

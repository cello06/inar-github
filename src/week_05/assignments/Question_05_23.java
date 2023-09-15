package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {

        double leftToRight = 0;

        double rightToLeft = 0;



        for (int i = 1; i <= 50_000; i++) {

            leftToRight += 1.0 / i;

        }


        for (int i = 50_000; i >= 1; i--) {

            rightToLeft += 1.0 / i;

        }


        System.out.println("Summation of series left to right : " + leftToRight);

        System.out.println("Summation of series right to left : " + rightToLeft);

        System.out.println("Summation of series right to left "
                + " - Summation of series left to right : "
                + (rightToLeft - leftToRight));
    }
}

package week_05.assigments;

public class Question_05_25 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100_000; i++) {
            sum += (Math.pow((-1), i + 1)) / ((2 * i) - 1);

            if (i == 10_000) {
                double sumOfFirstI = sum * 4;
                System.out.println("PI value for i=10_000 : " + sumOfFirstI);
            }
            if (i == 20_000) {
                double sumOfSecondI = sum * 4;
                System.out.println("PI value for i=20_000 : " + sumOfSecondI);
            }

        }
        sum *= 4;
        System.out.println("PI value for i=100_000 : " + sum);


        sum = 0;
    }
}

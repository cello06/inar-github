package week_05.assigments;

public class Question_05_20 {
    public static void main(String[] args) {

        boolean isPrimeNumber = true;

        int count = 0;


        for (int i = 2; i <= 1000; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrimeNumber = false;
                }
            }

            if (isPrimeNumber || i == 2) {
                System.out.print((count % 8 == 0) ? "\n" + i + " " : i + " ");
                count++;
            }
            isPrimeNumber = true;
        }
    }
}

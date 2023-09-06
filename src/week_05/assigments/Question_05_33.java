package week_05.assigments;

public class Question_05_33 {
    public static void main(String[] args) {

        int positiveDivisors = 0;

        System.out.println("Perfect numbers are : ");


        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    positiveDivisors += j;
                    //firstly I found sum of positive divisors
                }

            }
            if (i == positiveDivisors) {
                //I looked if sum of positive divisors equal to number
                System.out.println(i);
            }
            //we need to restart positiveDivisors for the next number..
            positiveDivisors = 0;
        }
    }
}

package week_05.assignments;

public class Question_05_13 {
    public static void main(String[] args) {

        int n=1;

        int largestN=1;

        while (Math.pow(n,3)<=12_000){

            largestN=n;

            if(largestN<=12_000){

                n++;
            }

        }

        System.out.print("The largest n is "+largestN);
    }
}

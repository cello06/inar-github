package week_05.assignments;

public class Question_05_12 {
    public static void main(String[] args) {

        int n=1;

        int squareOfN=1;
        while (squareOfN<=12_000){
            squareOfN=(int)Math.pow(n,2);
            if(squareOfN<=12_000) {
                n++;
            }
        }
        //square of negative is positive so the smallest number is negative of our number

        n*=-1;



        System.out.printf("The smallest n is %d",n);
    }
}

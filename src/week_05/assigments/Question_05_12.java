package week_05.assigments;

public class Question_05_12 {
    public static void main(String[] args) {

        int n=1;

        int squareOfN=1;


        do {

             squareOfN=(int)Math.pow(n,2);
            n++;

        }while (squareOfN<=12_000);


        System.out.printf("The smallest integer n such that square of"+
                " it is greater than 12,000 is --> %d"+
                "\nAnd square of it is --> %d",n,squareOfN);
    }
}

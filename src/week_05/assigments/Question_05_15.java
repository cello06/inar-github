package week_05.assigments;

public class Question_05_15 {
    public static void main(String[] args) {
        // (int)'!' = 33;
        // (int)'~' = 126;
        // for (int i = 33; i <=126 ; i++)  ---> we can also write like that...

        int count = 0;


        for (int i = '!'; i <= '~'; i++) {

            System.out.print((count % 10 == 0) ? ("\n" + (char) (i) + " ") : ((char) (i) + " "));

            count++;
        }
    }
}

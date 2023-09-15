package week_05.assignments;

public class Question_05_43 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i >= j) {
                    continue;
                    //I wrote this because I noticed that in every
                    //iteration some two numbers are same. To prevent
                    //that I made loop to ignore those equal numbers.
                }
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("Total number of all combinations is " + count);
    }

}

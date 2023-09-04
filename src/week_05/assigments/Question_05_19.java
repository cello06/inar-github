package week_05.assigments;

public class Question_05_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print("     ");//to be orderly it must be an odd number
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1) {
                    System.out.printf("%5d", k);//to be orderly it must be an odd number
                } else {
                    System.out.printf("%5d", (int) Math.pow(2, (k - 1)));//to be orderly it must be an odd number
                }
            }
            for (int m = i; m > 1; m--) {
                System.out.printf("%5d", (int) Math.pow(2, (m - 2)));//to be orderly it must be an odd number
            }
            System.out.println();
        }
    }
}

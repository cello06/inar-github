package week_05.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int randomNumber = 0;
        int countOfHeads = 0;
        int countOfTails = 0;

        System.out.println("Flipping a coin one million times...");

        for (int i = 1; i <= 1_000_000; i++) {
            randomNumber = (int) (Math.random() * 2) + 1;
            if (randomNumber == 1) {
                countOfHeads++;
            } else {
                countOfTails++;
            }

        }
        System.out.printf("Heads : %d\nTails : %d", countOfHeads, countOfTails);
    }
}

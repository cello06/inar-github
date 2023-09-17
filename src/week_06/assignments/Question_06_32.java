package week_06.assignments;

public class Question_06_32 {
    public static void main(String[] args) {
        final int COUNT_OF_PLAY = 10_000;
        int winNumbers = playCrabs(COUNT_OF_PLAY);
        System.out.println("Number of winning games : " + winNumbers);
    }

    public static int playCrabs(int countOfPlay) {
        int winNumber = 0;
        for (int i = 1; i <= countOfPlay; i++) {


            int numberOfFirstDice = rollDice();
            int numberOfSecondDice = rollDice();


            int sum = numberOfFirstDice + numberOfSecondDice;

            System.out.printf("You rolled %d + %d = %d\n", numberOfFirstDice, numberOfSecondDice, sum);

            if ((sum == 2) || (sum == 3) || (sum == 12)) {

                System.out.print("You lose");

            } else if ((sum == 7) || (sum == 11)) {

                System.out.print("You win");
                winNumber++;

            } else {

                System.out.println("point is " + sum);

                while (true) {
                    numberOfFirstDice = rollDice();
                    numberOfSecondDice = rollDice();
                    int otherSum = numberOfFirstDice + numberOfSecondDice;

                    System.out.printf("You rolled %d + %d = %d\n", numberOfFirstDice, numberOfSecondDice, otherSum);

                    if (otherSum == 7) {

                        System.out.print("You lose");
                        break;

                    } else if (otherSum == sum) {
                        System.out.println(("You win"));
                        winNumber++;
                        break;

                    } else {
                        System.out.println("point is " + otherSum);
                    }
                }
            }
        }
        return winNumber;
    }

    public static int rollDice() {
        int numberOfDice = (int) (Math.random() * 6) + 1;
        return numberOfDice;
    }
}

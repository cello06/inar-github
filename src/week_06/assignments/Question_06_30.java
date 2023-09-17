package week_06.assignments;

public class Question_06_30 {
    public static void main(String[] args) {
        playCrabs();
    }

    public static void playCrabs() {
        int numberOfFirstDice = rollDice();
        int numberOfSecondDice = rollDice();

        int sum = numberOfFirstDice + numberOfSecondDice;

        System.out.printf("You rolled %d + %d = %d\n", numberOfFirstDice, numberOfSecondDice, sum);

        if ((sum == 2) || (sum == 3) || (sum == 12)) {

            System.out.print("You lose");

        } else if ((sum == 7) || (sum == 11)) {

            System.out.print("You win");

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
                    break;

                } else {
                    System.out.println("point is " + otherSum);
                }
            }
        }
    }

    public static int rollDice() {
        int numberOfDice = (int) (Math.random() * 6) + 1;
        return numberOfDice;
    }
}

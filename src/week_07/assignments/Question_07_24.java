package week_07.assignments;

public class Question_07_24 {
    public static void main(String[] args) {
        couponCollector();
    }

    public static void couponCollector() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int[] deck = new int[52];
        boolean isTrue = true;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        String[] suitsOfCollectedCards = new String[4];//this will be my result(suits of four cards)
        String[] ranksOfCollectedCards = new String[4];//this will also be my result(ranks of four cards)

        shuffle(deck);//shuffling my deck.

        int numberOfPick = 0;

        while (isTrue) {

            int random = (int) (Math.random() * 52);

            suitsOfCollectedCards[0] = suits[random / 13];//for the first card I don't need any condition.(suit of first card);
            ranksOfCollectedCards[0] = ranks[random % 13];//for the first card I don't need any condition.(rank of first card);
            numberOfPick++;//first pick.

            for (int i = 1; i < suitsOfCollectedCards.length; i++) {//I will start the loop from 1 to pick second card(I have the first already)
                random = (int) (Math.random() * 52);
                for (int j = 0; j < i; j++) {
                    if (suitsOfCollectedCards[j] == suits[random / 13]) {//checking if I have this suit already.
                        numberOfPick++;
                        isTrue = false;
                        break;
                    }

                }
                if (!isTrue) {//to pick again I need to decrease i , to make while loop continue
                    i--;
                    isTrue = true;
                } else {
                    suitsOfCollectedCards[i] = suits[random / 13];
                    ranksOfCollectedCards[i] = ranks[random % 13];
                    numberOfPick++;
                }

            }
            isTrue = false;
        }
        printResult(suitsOfCollectedCards, ranksOfCollectedCards, numberOfPick);
    }

    public static void shuffle(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int random = (int) (Math.random() * list.length);

            int temp = list[i];
            list[i] = list[random];
            list[random] = temp;
        }
    }

    public static void printResult(String[] suits, String[] ranks, int numberOfPicks) {
        for (int i = 0; i < suits.length; i++) {
            System.out.println(ranks[i] + " of " + suits[i]);
        }
        System.out.println("number of picks : " + numberOfPicks);
    }
}

package week_07.live_class;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = createDeck();
        deck = shuffleDeck(deck);
        for (int i = 1; i <= 4; i++) {
            printRandomCard(deck);
        }
    }
    public static int[] createDeck(){
        int [] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }
    public static int[] shuffleDeck(int [] list){
        for (int i = 0; i < list.length; i++) {
            int randomIndex = (int)(Math.random()*(52-i));
            int temp = list[i];
            list[i] = list[randomIndex];
            list[randomIndex] = temp;
        }
        return list;
    }
    public static void printRandomCard(int[] list){
        String [] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String [] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int randomNumber = (int) (Math.random()*52);

        String suit = suits[randomNumber / 13];
        String rank = ranks[randomNumber % 13];
        System.out.println("Card Number "+randomNumber+" : "+rank+" of "+suit);
    }
}

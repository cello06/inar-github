package week_03.assigments;

import java.util.Scanner;

public class Question_03_24 {
    public static void main(String[] args) {
        int rank = (int) (Math.random() * (15 - 1)) + 1;
        String nameOfRank = " ";
        switch (rank) {
            case 1:
                nameOfRank = "Ace";
                break;
            case 2:
                nameOfRank = "1";
                break;
            case 3:
                nameOfRank = "2";
                break;
            case 4:
                nameOfRank = "3";
                break;
            case 5:
                nameOfRank = "4";
                break;
            case 6:
                nameOfRank = "5";
                break;
            case 7:
                nameOfRank = "6";
                break;
            case 8:
                nameOfRank = "7";
                break;
            case 9:
                nameOfRank = "8";
                break;
            case 10:
                nameOfRank = "9";
                break;
            case 11:
                nameOfRank = "10";
                break;
            case 12:
                nameOfRank = "Jack";
                break;
            case 13:
                nameOfRank = "Queen";
                break;
            case 14:
                nameOfRank = "King";
                break;
            default:
                System.out.println("Sth wrong happen");
        }
        int suit = (int) (Math.random() * (5 - 1) + 1);
        String nameOfSuit = " ";

        switch (suit) {
            case 1:
                nameOfSuit = "Clubs";
                break;
            case 2:
                nameOfSuit = "Diamonds";
                break;
            case 3:
                nameOfSuit = "Hearts";
                break;
            case 4:
                nameOfSuit = "Spades";
                break;
        }
        System.out.println("The card you picked is " + nameOfRank + " of " + nameOfSuit);

    }
}

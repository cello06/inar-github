package my_week_05;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int magicNumber = (int) (Math.random() * 101);
        int yourGuess;

        System.out.println("Guess a magic number between 0 and 100");

        while(true){
            System.out.print("Enter your guess : ");
            yourGuess = input.nextInt();
            if(yourGuess>magicNumber){
                System.out.println("Your guess is too high");
            } else if (yourGuess<magicNumber) {
                System.out.println("Your guess is too low");
            }else{
                System.out.println("Yes, the number is "+magicNumber);
                break;
            }
        }
    }
}

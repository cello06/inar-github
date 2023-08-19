package week_03.live_class;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("What is the result of " +
                "\n\n\n" + number1 + " - " + number2 + " = ");
        int answer = input.nextInt();
        if (answer == (number1 - number2)) {
            System.out.println("Correct Answer!!!");
        } else System.out.println("WRONG ANSWER!!!" + "\nRight answer should be --> " +
                (number1 - number2));

    }
}

package week_06.live_class;

import java.util.Scanner;

public class TestRandomCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Starting char : ");
        String firstChar = input.next();
        System.out.print("Finishing char : ");
        String lastChar = input.next();
        System.out.print("Enter how many random character that you want : ");
        int numberOfChar = input.nextInt();
        System.out.print("Enter how many character that you want per line : ");
        int charsPerLine = input.nextInt();

        for (int i = 0; i < numberOfChar; i++) {
            char ch = RandomCharacter.getRandomCharacter(firstChar.charAt(0), lastChar.charAt(0));
            if ((i + 1) % charsPerLine == 0){
                System.out.println(ch);
            }else{
                System.out.print(ch);
            }

        }
    }
}

package week_14;

import java.util.*;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String sentence = input.nextLine();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                continue;
            }
            if (!map.containsKey(sentence.charAt(i))) {
                map.put(sentence.charAt(i), 1);
            } else {
                map.put(sentence.charAt(i), map.get(sentence.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                continue;
            }
            if (map.get(sentence.charAt(i)) == 1) {
                System.out.println("The first non-repeating character is '" + sentence.charAt(i) + "' : " +
                        (i+1) + ". character of the string.");
                break;
            }
        }
    }
}

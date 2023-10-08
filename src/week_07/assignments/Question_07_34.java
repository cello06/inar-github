package week_07.assignments;

import java.util.Locale;
import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort : ");
        String str = input.nextLine();
        str = str.toLowerCase(Locale.ROOT);

        str = sort(str);
        System.out.print("Sorted form : "+str);
    }
    public static String sort(String str){
        char[] charsOfStr = new char[str.length()];
        for (int i = 0; i < charsOfStr.length; i++) {
            charsOfStr[i] = str.charAt(i);
        }

        for (int i = 0; i < charsOfStr.length ; i++) {
            char currentMinimumValue = charsOfStr[i];
            int currentMinIndex = i;
            for (int j = i+1; j <charsOfStr.length ; j++) {
                if(charsOfStr[j]-'a' < currentMinimumValue-'a'){
                    currentMinimumValue = charsOfStr[j];
                    currentMinIndex = j;
                    break;
                }
            }
            if(currentMinIndex != i){
                charsOfStr[currentMinIndex] = charsOfStr[i];
                charsOfStr[i] = currentMinimumValue;
            }
        }
        String result = "";
        for (int i = 0; i < charsOfStr.length; i++) {
            result += charsOfStr[i];
        }
        return result;
    }
}

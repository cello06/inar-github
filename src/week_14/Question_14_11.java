package week_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Question_14_11 {
    public static void main(String[] args) {

        System.out.println("Enter the Java source code file name :");
        String path = new Scanner(System.in).nextLine();
        StringBuilder page = new StringBuilder();
        try {
            File file = new File(path);
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String line = input.nextLine();
                page.append(line).append("\n");
            }
            boolean availablePairs = pairsCheck(page.toString());
            if (availablePairs) {
                System.out.println("The source code has correct pairs of grouping symbols.");
            } else {
                System.out.println("The source code has wrong pairs of grouping symbols.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public static boolean pairsCheck(String page) {
        Stack<Character> pairsStack = new Stack<>();
        for (int i = 0; i < page.length(); i++) {
            if (page.charAt(i) == '(') {
                pairsStack.push('(');
            } else if (page.charAt(i) == '{') {
                pairsStack.push('{');
            } else if (page.charAt(i) == '[') {
                pairsStack.push('[');
            } else if (page.charAt(i) == ')') {
                if (pairsStack.peek() == '(') {
                    pairsStack.pop();
                } else {
                    return false;
                }
            } else if (page.charAt(i) == '}') {
                if (pairsStack.peek() == '{') {
                    pairsStack.pop();
                } else {
                    return false;
                }
            } else if (page.charAt(i) == ']') {
                if (pairsStack.peek() == '[') {
                    pairsStack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

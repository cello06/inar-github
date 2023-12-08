package week_14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Question_14_10 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Post Fix Expression : ");
        String expression = input.nextLine();
        String[] parts = expression.split(" ");

        for (int i = 0; i < parts.length; i++) {
            if (Character.isDigit(parts[i].charAt(0))) {
                numbers.push(Integer.parseInt(parts[i]));
            } else {
                int b = numbers.pop();
                int a = numbers.pop();
                switch (parts[i]) {
                    case "+" -> numbers.push(a + b);
                    case "-" -> numbers.push(a - b);
                    case "/" -> numbers.push(a / b);
                    case "*" -> numbers.push(a * b);
                    default -> {
                        System.out.println("Wrong input!");
                        throw new RuntimeException("Wrong operator!");
                    }
                }
            }
        }
        int result = numbers.pop();
        System.out.println("Output : " + result);
        System.out.printf("Explanation : ((%s%s%s) %s %s) = %d", parts[0],
                parts[2], parts[1], parts[4], parts[3], result);


    }
}

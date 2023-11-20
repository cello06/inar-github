package week_12.assignments;

import java.util.InputMismatchException;

public class Question_12_01_With_Exception {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = Integer.parseInt(args[0]);


        } catch (NumberFormatException ex) {
            System.out.println("Wrong input :" + args[0]);
            System.exit(1);
        }
        try {
            num2 = Integer.parseInt(args[2]);

        } catch (NumberFormatException ex) {
            System.out.println("Wrong input :" + args[2]);
            System.exit(2);
        }
        System.out.println
                (args[0] + " " + args[1] + " " + args[2] + " = " + (num1 + num2));

    }
}

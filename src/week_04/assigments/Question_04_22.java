package week_04.assigments;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1 : ");

        String s1 = input.nextLine();

        System.out.print("Enter string s2 : ");

        String s2 = input.nextLine();


        boolean isS1ContainsS2 = s1.contains(s2);

        if (isS1ContainsS2) {

            System.out.printf("%s is a substring of %s", s2, s1);

        } else {

            System.out.printf("%s is not a substring of %s", s2, s1);

        }
    }
}

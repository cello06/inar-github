package week_04.assigments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {

        boolean valid = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters : ");

        String majorAndStatus = input.nextLine();

        String stringOfMajor = "";
        String stringOfStatus = "";


        char major = majorAndStatus.charAt(0);

        char status = majorAndStatus.charAt(1);


        switch (major) {
            case 'M':
                stringOfMajor = "Mathematics";
                break;
            case 'C':
                stringOfMajor = "Computer Science";
                break;
            case 'I':
                stringOfMajor = "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                valid = false;
        }


        if (valid) {
            switch (status) {
                case '1':
                    stringOfStatus = " Freshman";
                    break;
                case '2':
                    stringOfStatus = " Sophomore";
                    break;
                case '3':
                    stringOfStatus = " Junior";
                    break;
                case '4':
                    stringOfStatus = " Senior";
                    break;
                default:
                    System.out.println("Invalid input");
                    valid = false;
            }
        }


        if (valid) {
            System.out.println(stringOfMajor.concat(stringOfStatus));
        }
    }
}

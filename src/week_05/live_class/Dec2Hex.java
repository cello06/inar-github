package week_05.live_class;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");

        int quetient = input.nextInt();

        String hexNumber = "";

        int remainder = 0;


        do {

            remainder = quetient % 16;

            quetient = quetient / 16;


            if (remainder < 10) {

                hexNumber = Integer.toString(remainder).concat(hexNumber);

            } else if (remainder <= 15) {

                if (remainder == 10) {

                    hexNumber = "A".concat(hexNumber);

                } else if (remainder == 11) {

                    hexNumber = "B".concat(hexNumber);

                } else if (remainder == 12) {

                    hexNumber = "C".concat(hexNumber);

                } else if (remainder == 13) {

                    hexNumber = "D".concat(hexNumber);

                } else if (remainder == 14) {

                    hexNumber = "E".concat(hexNumber);

                } else {

                    hexNumber = "F".concat(hexNumber);

                }

            } else {

                System.out.println("Something wrong happened!!");
                System.exit(1);

            }

        } while (quetient != 0);


        System.out.printf("The hex number is %s ", hexNumber);
    }
}

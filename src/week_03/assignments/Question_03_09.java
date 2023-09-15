package week_03.assignments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits " +
                " of an ISBN as integer :");

        int ısbn = input.nextInt();

        int remaingIsbn;

        int firstDigit = ısbn % 10;
        remaingIsbn = ısbn / 10;

        int secondDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int thirdDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int fourthDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int fifthDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int sixthDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int seventhDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int eigthDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int ninthDigit = remaingIsbn % 10;
        remaingIsbn = remaingIsbn / 10;

        int lastDigit = ((ninthDigit * 1) + (eigthDigit * 2) + (seventhDigit * 3) +
                (sixthDigit * 4) + (fifthDigit * 5) + (fourthDigit * 6) +
                (thirdDigit * 7) + (secondDigit * 8) + (firstDigit * 9)) % 11;

        if (lastDigit == 10) {
            System.out.println("The ISBN-10 number is " + ninthDigit + eigthDigit + seventhDigit + sixthDigit + fifthDigit +
                    fourthDigit + thirdDigit + secondDigit + firstDigit + "X");

        } else {
            System.out.println("The ISBN-10 number is " + ninthDigit + eigthDigit + seventhDigit + sixthDigit + fifthDigit +
                    fourthDigit + thirdDigit + secondDigit + firstDigit + lastDigit);
        }

    }
}

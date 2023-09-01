package my_week_05;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int date = 1;
        int sum = 0;

        while(date!=0){

            System.out.print("Enter an integer"+
                    " (the input ends if it is 0) : ");

            date = input.nextInt();

            sum+=date;
        }

        System.out.printf("The sum is %d",sum);
    }
}

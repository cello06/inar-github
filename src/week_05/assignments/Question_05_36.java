package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer : ");

        int numberOfISBN = input.nextInt();


        String stringOfNumberOfISBN = Integer.toString(numberOfISBN);
        //I need to add this if statement because when I take the number
        //starting with zero, int variable does not see that zero...


        if(stringOfNumberOfISBN.length()==8){
            stringOfNumberOfISBN="0".concat(stringOfNumberOfISBN);
        }


        int calculationOfFirstNineDigits=0;

        //I used loops and charAt() method to take characters
        //one by one and convert them to integer by using Integer.parseInt()
        //method.And then I made the calculation...
        for (int i = 1; i <= 9; i++) {

            calculationOfFirstNineDigits+=Integer.parseInt(""+stringOfNumberOfISBN.charAt(i-1))*i;

        }

        if(calculationOfFirstNineDigits%11==10){
            stringOfNumberOfISBN=stringOfNumberOfISBN+"X";
        }else{
            stringOfNumberOfISBN=stringOfNumberOfISBN+Integer.toString(calculationOfFirstNineDigits%11);
        }

        System.out.println("The ISBN-10 number is "+stringOfNumberOfISBN);

    }
}

package week_05.assigments;

public class Question_05_07 {
    public static void main(String[] args) {

        double tuition = 10_000;

        double sumOfFourYearsCost=0;

        int year;



        for(year=1;year<=10;year++){

            if(year<=4) {

                sumOfFourYearsCost += tuition;
            }

            tuition+=(tuition/100)*5;
        }


        System.out.printf("After four years the total cost is $%.3f"+
                "\nAfter 10 years the tuition will be $%.3f",sumOfFourYearsCost,tuition);
    }
}

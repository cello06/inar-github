package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {

        int count =0;

        int firstLeapYear=0;

        int leapYear=0;

        //Firstl I found the first leap year so that
        //I can increase i in second loop +4 in each iteration.


        for (int i=101;i<=105;i++){

            if((i%4==0&&(i%100!=0)||(i%400==0))){

                firstLeapYear=i;
            }
        }

        System.out.println("All the leap years from 101 to 2100 : ");

        for(int i=firstLeapYear;i<=2100;i+=4){

            if((i%4==0&&(i%100!=0)||(i%400==0))){

                leapYear=i;

                System.out.print((count%10==0)?"\n"+leapYear+" ":leapYear+" ");

                count++;

            }

        }
    }
}

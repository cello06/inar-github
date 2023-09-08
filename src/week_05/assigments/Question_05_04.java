package week_05.assigments;

public class Question_05_04 {
    public static void main(String[] args) {

        int miles ;

        double kilometers;

        System.out.printf("%-10s%10s\n","Miles","Kilometers");

        for (miles=1;miles<=10;miles++){

            kilometers=miles*1.609;

            System.out.printf("%-10d%-10.3f",miles,kilometers);
            System.out.println();
        }

    }
}

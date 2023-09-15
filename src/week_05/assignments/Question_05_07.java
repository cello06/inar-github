package week_05.assignments;

public class Question_05_07 {
    public static void main(String[] args) {

        double tuition = 10_000;
        double tuitionToShow = 0;
        double sumOfFourYearsCost = 0;

        int year;


        for (year = 1; year <= 15; year++) {

            if (year >= 12) {

                sumOfFourYearsCost += tuition;
            }
            if (year <= 11) {
                tuitionToShow=tuition;

            }

            tuition += (tuition / 100) * 5;
        }
        System.out.printf("Tuition in ten years : $%.0f\n",tuitionToShow);
        System.out.printf("Total cost for four years' worth of tuition after the : "
                +" tenth year : $%.0f",sumOfFourYearsCost);


    }
}

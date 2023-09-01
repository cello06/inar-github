package week_05.live_class;

public class FutureTuition {
    public static void main(String[] args) {

        double tuition = 10_000;

        int year = 0;


        do {
            tuition += (tuition / 100) * 7;
            year++;
        } while (tuition <= 20_000);


        System.out.printf("Tuition will be doubled in %d years", year);
        System.out.printf("\nTuition will be %.2f in %d years", tuition, year);

    }
}

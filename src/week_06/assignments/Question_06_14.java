package week_06.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.println("i          m(i)");
        System.out.println("------------------------");
        int number = 1;

        while (number <= 901) {
            System.out.printf("%-10d%-10.4f\n", number, estimatePI(number));
            number += 100;
        }
    }

    public static double estimatePI(int number) {
        double estimatedPI = 0;

        for (int i = 1; i <= number; i++) {
            estimatedPI += 4 * (Math.pow(-1, i + 1) / ((2 * i) - 1));
        }
        return estimatedPI;
    }
}

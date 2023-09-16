package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {

        printTableOfSalesAmuntCommission();

    }

    private static void printTableOfSalesAmuntCommission() {
        System.out.println("SalesAmount     Commission");
        System.out.println("-------------------------------");

        double salesAmount = 10_000;
        double commission;

        while (salesAmount <= 100_000) {
            commission = computeCommission(salesAmount);
            System.out.printf("%-15.0f%11.1f\n", salesAmount, commission);
            salesAmount += 5_000;
        }
    }

    private static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount <= 5_000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10_000) {
            commission = 5_000 * 0.08 + (salesAmount - 5_000) * 0.1;
        } else {
            commission = 5_000 * 0.08 + 5_000 * 0.1 + (salesAmount - 10_000) * 0.12;
        }
        return commission;
    }
}

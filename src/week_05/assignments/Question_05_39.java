package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {
        final int BASE_SALARY = 5_000;
        int goalSalary = 30_000;
        int commissionToEarnGoalSalary = goalSalary - BASE_SALARY;
        double commissionRate = 0.08;
        double commision = 0;
        double commisionOfFirst5000 = 0;
        double commisionOfSecond5000 = 0;


        double salesAmount = 5000;

        while (commision <= commissionToEarnGoalSalary) {

            if (salesAmount <= 5000) {

                commisionOfFirst5000 += salesAmount * commissionRate;

            } else if (salesAmount <= 10_000) {

                commissionRate = 0.1;

                commisionOfSecond5000 += (salesAmount - 5000) * commissionRate;

            } else {

                commissionRate = 0.12;

                commision = commisionOfFirst5000 + commisionOfSecond5000 + (salesAmount - 10000) * commissionRate;

            }


            if (salesAmount <= 10_000) {

                salesAmount += 5000;

            } else {

                salesAmount += 0.01;

            }
        }
        System.out.printf("Minimum sales to earn $30,000 : %.2f", salesAmount);

    }
}

package week_04.assigments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name : ");

        String nameOfEmployee = input.nextLine();

        System.out.print("Enter number of hours worked in a week : ");

        double numberOfHoursWorkedWeekly = input.nextDouble();

        System.out.print("Enter hourly pay rate : ");

        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate : ");

        double federalTaxWithholdingRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate : ");

        double stateTaxWithholdingRate = input.nextDouble();


        //Gross Pay= HoursWorked * PayRate
        //Federal Withholding = GrossPay * federalTaxWithholdingRate
        //State Withholding = GrossPay * stateTaxWithholdingRate
        //Total Deduction = Federal Withholding + State Withholding
        //Net Pay = Gross Pay - Total Deduction


        double grossPay = numberOfHoursWorkedWeekly * hourlyPayRate;

        double federalWithholding = grossPay * federalTaxWithholdingRate;

        double stateWitholding = grossPay * stateTaxWithholdingRate;

        double totalDeduction = federalWithholding + stateWitholding;

        double netPay = grossPay - totalDeduction;


        System.out.printf("Employee Name : %s\n" +
                        "Hours Worked : %.1f\n" +
                        "Pay Rate : $%4.2f\n" +
                        "Gross Pay : $%3.1f\n" +
                        "Deductions : \n" +
                        "   Federal Withholding (%3.1f%%) : $%3.1f\n" +
                        "   State Withholding (%3.1f%%) : $%4.2f\n" +
                        "   Total Deduction : $%4.2f\n" +
                        "Net Pay : $%4.2f", nameOfEmployee, numberOfHoursWorkedWeekly,
                hourlyPayRate, grossPay, (int) (federalTaxWithholdingRate * 100) / 1.0, federalWithholding,
                (int) (stateTaxWithholdingRate * 100) / 1.0, stateWitholding, totalDeduction, netPay);
    }
}

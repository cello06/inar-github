package week_06.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        printTableOfTaxableIncome();
    }

    public static void printTableOfTaxableIncome() {
        System.out.println("Taxable        Single        Married Joint        Married        Head of");
        System.out.println("Income                       or Qualifying        Separate       a Hause");
        System.out.println("                             Widow(er)");
        System.out.println("-----------------------------------------------------------------------------");

        double taxableIncome = 50_000;

        int statusForSingle = 1;
        int statusForMarriedJointOrQlfWidow = 2;
        int statusForMarriedSeparate = 3;
        int statusForHeadOfAHouse = 4;

        int taxableIncomeForSingle = 0;
        int taxableIncomeForMarriedJointOrQlfWidow = 0;
        int taxableIncomeForMarriedSeparate = 0;
        int taxableIncomeForHeadOfAHouse = 0;

        while (taxableIncome <= 60_000) {
            taxableIncomeForSingle = (int) Math.round(computeTax(statusForSingle, taxableIncome));

            taxableIncomeForMarriedJointOrQlfWidow = (int) Math.round(computeTax(statusForMarriedJointOrQlfWidow, taxableIncome));

            taxableIncomeForMarriedSeparate = (int) Math.round(computeTax(statusForMarriedSeparate, taxableIncome));

            taxableIncomeForHeadOfAHouse = (int) Math.round(computeTax(statusForHeadOfAHouse, taxableIncome));

            System.out.printf("%-15d%-15d%-20d%-15d%-15d\n", (int)taxableIncome, taxableIncomeForSingle,
                    taxableIncomeForMarriedJointOrQlfWidow, taxableIncomeForMarriedSeparate, taxableIncomeForHeadOfAHouse);

            taxableIncome += 50;
        }

    }

    public static double computeTax(int status, double taxableIncome) {
        double computedTax = 0;
        //taxable income will be between 50_000 and 60_000
        //So we do not need to look other ranges ...
        if (status == 1) {// Compute tax for single filers

            computedTax = 8350 * 0.10 + (33_950 - 8350) * 0.15 + (taxableIncome - 33_950) * 0.25;

        } else if (status == 2) {// Compute tax for married file jointly or qualifying widow(er)

            computedTax = 16_700 * 0.10 + (taxableIncome - 16_700) * 0.15;

        } else if (status == 3) {// Compute tax for married filing separately

            computedTax = 8_350 * 0.10 + (33_950 - 8350) * 0.15 + (taxableIncome - 33_950) * 0.25;

        } else {// Compute tax for head of household

            computedTax = 11_950 * 0.10 + (45_500 - 11_950) * 0.15 + (taxableIncome - 45_500) * 0.25;
        }
        return computedTax;
    }
}

package week_10.assignments.classes;

public class Tax {
    private int filingStatus;
    private double taxableIncome;

    private static int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
    };
    private static double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    public Tax() {

    }

    public Tax
            (int filingStatus,
             int[][] brackets,
             double[] rates,
             double taxableIncome) {
        this.filingStatus = filingStatus;
        Tax.brackets = brackets;
        Tax.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        Tax.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        Tax.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {

        if (brackets[filingStatus][0] > taxableIncome) {
            return taxableIncome * rates[0];
        } else if (brackets[filingStatus][1] > taxableIncome) {
            return brackets[filingStatus][0] * rates[0]
                    + (taxableIncome - brackets[filingStatus][0]) * rates[1];
        } else if (brackets[filingStatus][2] > taxableIncome) {
            return brackets[filingStatus][0] * rates[0] +
                    (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                    (taxableIncome - brackets[filingStatus][1]) * rates[2];
        } else if (brackets[filingStatus][3] > taxableIncome) {
            return brackets[filingStatus][0] * rates[0] +
                    (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                    (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                    (taxableIncome - brackets[filingStatus][2]) * rates[3];
        } else if (brackets[filingStatus][4] > taxableIncome) {
            return brackets[filingStatus][0] * rates[0] +
                    (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                    (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                    (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                    (taxableIncome - brackets[filingStatus][3]) * rates[3];
        } else {
            return brackets[filingStatus][0] * rates[0] +
                    (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                    (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                    (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                    (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4] +
                    (taxableIncome - brackets[filingStatus][4]) * rates[3];

        }

    }
}

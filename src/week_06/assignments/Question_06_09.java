package week_06.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-6s%-5s|%-5s%-10s%-10s\n", "Feet", "Meters", " ", " ", "Meters", "Feet");
        System.out.println("-----------------------------------------------------");

        printTable();
    }

    public static void printTable() {
        double feet = 1.0;
        double meter = 20.0;

        while (feet <= 10.0 || meter <= 65.0) {
            System.out.printf("%-10.1f%-6.3f%-5s|%-5s%-10.1f%-10.3f\n", feet, feetToMeter(feet), " ", " ", meter, meterToFeet(meter));
            feet++;
            meter += 5;

        }
    }

    public static double feetToMeter(double feet) {
        double meter = 0.305 * feet;
        return meter;
    }

    public static double meterToFeet(double meter) {
        double feet = 3.279 * meter;
        return feet;
    }
}

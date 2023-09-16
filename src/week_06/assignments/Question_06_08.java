package week_06.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s   |   %-13s%-10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("-----------------------------------------------");

        printTable();
    }

    private static void printTable() {
        double celsius = 40.0;
        double fahrenheit = 120.0;

        while (celsius >= 31.0 || fahrenheit >= 30.0) {
            System.out.printf("%-9.1f%-9.1f     |   %-13.1f%-9.1f\n",
                    celsius, celsiusToFahrenheit(celsius),
                    fahrenheit, fahrenheitToCelsius(fahrenheit));
            celsius--;
            fahrenheit -= 10;
        }
    }


    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

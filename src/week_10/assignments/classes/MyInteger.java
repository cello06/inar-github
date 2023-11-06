package week_10.assignments.classes;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false; // Numbers less than or equal to 1 are not prime.
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger) {
        return isOdd(myInteger.getValue());
    }

    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.getValue());
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean equals(int number) {
        return value == number;
    }

    public boolean equals(MyInteger myInteger) {
        return value == myInteger.getValue();
    }

    public static int parseInt(char[] array) {
        String number = "";
        for (int i = 0; i < array.length; i++) {
            if (!Character.isDigit(array[i])) {
                System.out.println("Wrong value for integer");
                System.exit(1);
            } else {
                number += array[i];
            }
        }
        return Integer.parseInt(number);
    }

    public static int parseInt(String number) {
        return Integer.parseInt(number);
    }
}

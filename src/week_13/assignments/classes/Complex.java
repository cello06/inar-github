package week_13.assignments.classes;

public class Complex implements Cloneable {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this(0);
    }

    public Complex(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex other) {
        double real = this.realPart + other.getRealPart();
        double imaginary = this.imaginaryPart + other.getImaginaryPart();
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex other) {
        double real = this.realPart - other.getRealPart();
        double imaginary = this.imaginaryPart - other.getImaginaryPart();
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex other) {
        double real = this.realPart * other.getRealPart()
                - this.imaginaryPart * other.getImaginaryPart();
        double imaginary = this.imaginaryPart * other.getRealPart()
                + this.realPart * other.getImaginaryPart();
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex other) {
        double real = (this.realPart * other.getRealPart()
                + this.imaginaryPart * other.getImaginaryPart())
                / (Math.pow(other.getRealPart(), 2)
                + Math.pow(other.getImaginaryPart(), 2));
        double imaginary = (this.imaginaryPart * other.getRealPart()
                - this.realPart * other.getImaginaryPart())
                / (Math.pow(other.getRealPart(), 2)
                + Math.pow(other.getImaginaryPart(), 2));
    return new Complex(real,imaginary);
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.realPart, 2) + Math.pow(this.imaginaryPart, 2));
    }

    @Override
    public String toString() {
        return "(" + realPart + ((imaginaryPart != 0) ? " + " + imaginaryPart + "i": "") + ")";
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }

}

package week_09.assignments.classes;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        //b2 - 4ac
        return Math.pow(getB(), 2) - (4 * getA() * getC());
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-getB() + Math.sqrt(getDiscriminant())) / 2 * getA();
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-getB() - Math.sqrt(getDiscriminant())) / 2 * getA();
        }
    }

}

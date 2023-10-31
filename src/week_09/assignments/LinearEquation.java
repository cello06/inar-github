package week_09.assignments;

public class LinearEquation {
    private double A;
    private double B;
    private double C;
    private double D;
    private double E;
    private double F;

    LinearEquation(double A, double B, double C, double D, double E, double F) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public double getD() {
        return D;
    }

    public double getE() {
        return E;
    }

    public double getF() {
        return F;
    }

    public boolean isSolvable() {
        return getA() * getD() - getB() * getC() != 0;
    }

    public double getX() {
        return (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
    }

    public double getY() {
        return (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
    }
}

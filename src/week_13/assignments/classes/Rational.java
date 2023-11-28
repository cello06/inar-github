package week_13.assignments.classes;

public class Rational extends Number implements Comparable<Rational> {
    private long[] r = new long[2];

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.r[1] = Math.abs(denominator) / gcd;
    }

    public static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);

        int gcd = 1;
        int possibleGCD = 2;
        while (possibleGCD <= Math.min(n1, n2)) {
            if (n1 % possibleGCD == 0 && n2 % possibleGCD == 0) {
                gcd = possibleGCD;
            }
            possibleGCD++;
        }
        return gcd;
    }
    public long getNumerator(){
        return this.r[0];
    }
    public long getDenominator(){
        return this.r[1];
    }

    public Rational add(Rational secondRational) {
        long n = this.getNumerator() * secondRational.getDenominator() +
                this.getDenominator() * secondRational.getNumerator();
        long d = this.getDenominator() * secondRational.getDenominator();
        return new Rational(n, d);
    }
    public Rational subtract(Rational secondRational) {
        long n = this.getNumerator() * secondRational.getDenominator()
                - this.getDenominator() * secondRational.getNumerator();
        long d = this.getDenominator() * secondRational.getDenominator();
        return new Rational(n, d);
    }
    public Rational multiply(Rational secondRational) {
        long n = this.getNumerator() * secondRational.getNumerator();
        long d = this.getDenominator() * secondRational.getDenominator();
        return new Rational(n, d);
    }
    public Rational divide(Rational secondRational) {
        long n = this.getNumerator() * secondRational.getDenominator();
        long d = this.getDenominator() * secondRational.getNumerator();
        return new Rational(n, d);
    }
    @Override
    public String toString(){
        if(this.getDenominator() == 1){
            return this.getNumerator() + " ";
        }else {
            return this.getNumerator() + "/" + this.getDenominator();
        }
    }
    @Override
    public boolean equals(Object o){
        if((this.subtract((Rational) (o))).getNumerator() == 0){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public int compareTo(Rational o) {
        if(this.subtract(o).getNumerator() > 0){
            return 1;
        } else if (this.subtract(o).getNumerator() == 0) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.getNumerator() *1.0 / this.getDenominator();
    }
}

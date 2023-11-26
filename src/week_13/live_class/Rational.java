package week_13.live_class;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational() {
        this(0, 1);
    }

    @Override
    public int intValue() {
        return (int)doubleValue() ;
    }

    @Override
    public long longValue() {
        return (long)doubleValue() ;
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.numerator * 1.0 / this.denominator;
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;

        this.denominator = Math.abs(denominator / gcd);
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

    public long getNumerator() {
        return this.numerator;
    }

    public long getDenominator() {
        return this.denominator;
    }

    public Rational add(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator() +
                this.denominator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.numerator;
        return new Rational(n, d);
    }
    @Override
    public String toString(){
        if(denominator == 1){
            return numerator + " ";
        }else {
            return numerator + "/" + denominator;
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
}

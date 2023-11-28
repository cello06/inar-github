package week_13.live_class;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class FixedRational extends Number implements Comparable<FixedRational> {
    private BigInteger numerator;
    private BigInteger denominator;

    public FixedRational() {
        this(new BigInteger("0"), new BigInteger("1"));
    }
    public FixedRational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.denominator = denominator.divide(gcd).abs();

        //this.denominator = denominator;
        this.numerator = ((this.denominator.compareTo(new BigInteger("0")) == 1) ? new BigInteger("1"):new BigInteger("-1") ).multiply((numerator.divide(gcd)));

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

        BigDecimal numer = new BigDecimal(this.numerator.doubleValue());
        BigDecimal deNumer = new BigDecimal(this.denominator.doubleValue());
       BigDecimal oldResult = numer.divide(deNumer,2, RoundingMode.DOWN);
        return oldResult.doubleValue();

    }




    public BigInteger getNumerator() {
        return this.numerator;
    }

    public BigInteger getDenominator() {
        return this.denominator;
    }

    public FixedRational add(FixedRational secondRational) {
        BigInteger n = this.numerator .multiply (secondRational.getDenominator()).add(this.denominator .multiply (secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new FixedRational(n, d);
    }

    public FixedRational subtract(FixedRational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator .multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new FixedRational(n, d);
    }

    public FixedRational multiply(FixedRational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new FixedRational(n, d);
    }

    public FixedRational divide(FixedRational secondRational) {
        BigInteger n = numerator .multiply (secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new FixedRational(n, d);
    }
    @Override
    public String toString(){
        if(denominator.equals(new BigInteger("1"))){
            return numerator + " ";
        }else {
            return numerator + "/" + denominator;
        }
    }
    @Override
    public boolean equals(Object o){
        if((this.subtract((FixedRational) (o))).getNumerator().equals(new BigInteger("0"))){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int compareTo(FixedRational o) {
        if(this.subtract(o).getNumerator().compareTo(new BigInteger("0")) == 1){
            return 1;
        } else if (this.subtract(o).getNumerator().compareTo(new BigInteger("0")) == 0) {
            return 0;
        }else {
            return -1;
        }
    }
}

package ch8.projects;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
        this(0, 1);
    }
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }
        makeCanonicalForm(numerator, denominator);
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public String toString() {
        if (denominator == 1) {
            return String.format("\"%d\"", numerator);
        } else {
            return String.format("\"%d/%d\"", numerator, denominator);
        }
    }

    public void makeCanonicalForm(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
        if (denominator < 0) {
            numerator = - numerator;
            denominator = - denominator;
        }
        this.numerator = numerator;
        this. denominator = denominator;
    }

    public int gcd(int numerator, int denominator) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(Math.abs(numerator), Math.abs(denominator)); i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public void add(RationalNumber rationalNumber) {
        int n = this.numerator * rationalNumber.getDenominator() + this.denominator * rationalNumber.getNumerator();
        int d = this.denominator * rationalNumber.getDenominator();
        makeCanonicalForm(n, d);
    }

    public void subtract(RationalNumber rationalNumber) {
        int n = this.numerator * rationalNumber.getDenominator() - this.denominator * rationalNumber.getNumerator();
        int d = this.denominator * rationalNumber.getDenominator();
        makeCanonicalForm(n, d);
    }

    public void multiply(RationalNumber rationalNumber) {
        int n = this.numerator * rationalNumber.getNumerator();
        int d = this.denominator * rationalNumber.getDenominator();
        makeCanonicalForm(n, d);
    }

    public void divide(RationalNumber rationalNumber) {
        int n = this.numerator * rationalNumber.getDenominator();
        int d = this.denominator * rationalNumber.getNumerator();
        makeCanonicalForm(n, d);
    }
}

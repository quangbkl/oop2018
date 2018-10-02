package week2.task2;

public class Fraction {
    public static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
//        if (denominator == 0) System.out.println("Invalid.");
//        int numGCD = gcd(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
//        if (denominator == 0) System.out.println("Invalid.");
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction other) {
        // Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(Fraction other) {
        // Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction other) {
        // Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        return new Fraction(numerator, denominator);
    }

    public boolean equals(Object object) {
        Fraction other = (Fraction) object;
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }
}

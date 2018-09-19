package week2.task2;

public class Fraction {

    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) System.out.println("Invalid.");
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
        if (denominator == 0) System.out.println("Invalid.");
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
//
//    public static void main(String[] args) {
//        Fraction fraction = new Fraction(1, 0);
//        Fraction fraction1 = new Fraction(3, 2);
//        Fraction add = fraction.add(fraction1);
//        System.out.println(add.getNumerator() + "/" + add.getDenominator());
//    }
}

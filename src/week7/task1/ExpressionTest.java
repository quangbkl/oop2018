package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression numeral_10 = new Numeral(10);
        Expression numeral_1 = new Numeral(1);
        Expression numeral_2 = new Numeral(2);
        Expression numeral_3 = new Numeral(3);

        Expression square_10 = new Square(numeral_10);
        Expression multiplication = new Multiplication(numeral_2, numeral_3);
        Expression subtraction = new Subtraction(square_10, numeral_1);
        Expression addition = new Addition(subtraction, multiplication);
        Expression expression = new Square(addition);

        System.out.print(expression.evaluate());
    }
}

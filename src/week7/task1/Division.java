package week7.task1;

public class Division extends BinaryExpression {
    Expression left, right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return "Division{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public int evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) throw new ArithmeticException();
        return left.evaluate() / right.evaluate();
    }
}

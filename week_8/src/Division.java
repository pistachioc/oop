public class Division extends BinaryExpression {

    /**
     * Constructor.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new java.lang.ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
}

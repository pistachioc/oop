public class Multiplication extends BinaryExpression {

    /**
     * Constructor.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}

public abstract class BinaryExpression extends Expression {

    protected Expression left;
    protected Expression right;

    /**
     * Constructor.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return 0;
    }

    /**
     * toString.
     */
    public String toString() {
        return left.toString() + " " + right.toString();
    }
}

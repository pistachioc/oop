public  class Square extends Expression {
    
    private Expression expression;

    /**
     * Constructor.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }
}

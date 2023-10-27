public class Numeral extends Expression {

    private double value;

    /**
     * Constructor.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Constructor.
     */
    public Numeral(){
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return value;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return Integer.toString((int) this.value);
    }
}

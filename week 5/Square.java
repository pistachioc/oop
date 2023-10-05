public class Square extends Rectangle {

    /**
     * Constructor.
     */
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * set side.
     */
    public void setSide(double side) {
        width = side;
        length = side;
    }

    /**
     * get side.
     */
    public double getSide() {
        return width;
    }

    /**
     * set length.
     */
    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    /**
     * set width.
     */
    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    /**
     * to string.
     */
    @Override
    public String toString() {
        return "Square[side=" + width + ",color=" + color + ",filled=" + filled + "]";
    }
}

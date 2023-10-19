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

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * getSide.
     */
    public double getSide() {
        return width;
    }

    /**
     * setSide.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * setWidth.
     */
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    /**
     * setLength.
     */
    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square square = (Square) obj;
            return Math.abs(width - square.width) < 0.001
                    && Math.abs(length - square.length) < 0.001
                    && topLeft.equals(square.topLeft);
        }
        return false;
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return (int) (31 * width * length);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft.toString()
                + ",side=" + width
                + ",color=" + color
                + ",filled=" + filled + "]";
    }
}

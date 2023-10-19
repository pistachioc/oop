public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Constructor.
     */
    public Rectangle() {
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * getTopLeft.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * setTopLeft.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * getLength.
     */
    public double getLength() {
        return length;
    }

    /**
     * setLength.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getWidth.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setWidth.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getArea.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return Math.abs(width - other.width) < 0.001 
                    && Math.abs(length - other.length) < 0.001
                    && topLeft.equals(other.topLeft);
        }
        return false;
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return (int) (width + length);
    }
    
    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString()
                        + ",width=" + width
                        + ",length=" + length
                        + ",color=" + color
                        + ",filled=" + filled + ']';
    }

}   

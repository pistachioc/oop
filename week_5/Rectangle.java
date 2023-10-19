public class Rectangle extends Shape {
    protected double width;
    protected double length;

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
     * get width.
     */
    public double getWidth() {
        return width;
    }
    
    /**
     * set width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * get length.
     */
    public double getLength() {
        return length;
    }

    /**
     * set length.
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    /**
     * get perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /*
     * get area.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * to string.
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length 
                + ",color=" + color + ",filled=" + filled + "]";
    }
}

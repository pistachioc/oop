public abstract class Shape {

    protected String color;
    protected boolean filled;

    /**
     * Constructor.
     */
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getters and setters.
     */
    public String getColor() {
        return color;
    }

    /**
     * set color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * is filled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * set filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * get area.
     */
    public abstract double getArea();

    /**
     * get perimeter.
     */
    public abstract double getPerimeter();

    /**
     * to string.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}

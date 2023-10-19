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
     * Getters color.
    */
    public String getColor() {
        return color;
    }

    /**
     * Setters color.
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
     * getArea.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
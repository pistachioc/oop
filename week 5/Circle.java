public class Circle extends Shape {

    protected double radius;

    /**
     * Constructor.
     */
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * get radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * get area.
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    /**
     * to string.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
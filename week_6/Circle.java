public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Constructor.
     */
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,  String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * Getters Point.
     */
    public Point getCenter() {
        return center;
    }
    
    /**
     * Setters Point.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Getters radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setters radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea.
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * getPerimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Circle[center=" + center.toString()
                        + ",radius=" + radius
                        + ",color=" + color
                        + ",filled=" + filled + ']';
    }

    /**
     * Equals.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            return Math.abs(radius - circle.radius) < 0.001
                    && center.equals(circle.center);
        }
        return false;
    }
     

    /**
     * Hashcode.
     */
    @Override
    public int hashCode() {
        return (int) radius;
    }

}



public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private double radius;
    private Point center;

    /**
     * Constructor.
     */
    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     * getCenter.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * setCenter.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * getRadius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setRadius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    // /**
    //  * getInfo.
    //  */
    // public String getInfo() {
    //     return "Circle[(" + center.getPointX() + ","
    //             + center.getPointY()
    //             + "),r=" + radius + "]";
    // }

    /**
     * getInfo.
     */
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", center.getPointX()) + ","
                + String.format("%.2f", center.getPointY())
                + "),r=" + String.format("%.2f", radius) + "]";
    }
}

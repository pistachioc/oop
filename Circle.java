import java.lang.Math;

public class Circle {

    private double radius;
    private String color;
    protected static final double pi = Math.PI;

    /**
     * phuong thuc khoi tao.
     */
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * tra ve ban kinh.
     * 
     * @return ban kinh
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set ban kinh.
     * 
     * @param radius ban kinh
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * tra ve mau sac.
     * 
     * @return mau sac
     */
    public String getColor() {
        return color;
    }

    /**
     * set mau sac.
     * 
     * @param color mau sac
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * tinh dien tich.
     * 
     * @return dien tich
     */
    public double getArea() {
        return this.radius * this.radius * pi;
    }

    /**
     * lay thong tin hinh tron.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
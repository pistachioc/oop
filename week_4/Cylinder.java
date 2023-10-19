public class Cylinder extends Circle {
    private double height;

    /**
     * phuong thuc khoi tao.
     */
    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double heigth) {
        super(radius);
        this.height = heigth;
    }

    public Cylinder(double radius, double heigth, String color) {
        super(radius, color);
        this.height = heigth;
    }

    /**
     * tra ve chieu cao.
     * 
     * @return chieu cao
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * set chieu cao.
     * 
     * @param heigth chieu cao
     */
    public void setHeight(double heigth) {
        this.height = heigth;
    }

    /**
     * tra ve the tich.
     * 
     * @return the tich
     */
    public double getVolume() {
        return super.getArea() * this.height;
    }

    /**
     * tinh dien tich hinh tru.
     */
    @Override
    public double getArea() {
        double baseArea = super.getArea();
        double lateralArea = 2 * pi * getRadius() * height;
        return 2 * baseArea + lateralArea;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}
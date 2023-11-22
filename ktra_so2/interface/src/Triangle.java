public class Triangle implements GeometricObject {

    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if (arePointEquals(p1, p2) || arePointEquals(p1, p3) || arePointEquals(p2, p3)) {
            throw new RuntimeException("Các điểm trùng nhau. Không thể tạo tam giác.");
        } else if (arePointInOneLine(p1, p2, p3)) {
            throw new RuntimeException("Các điểm thẳng hàng. Không thể tạo tam giác.");
        } 
        
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }

    /**
     * arePoint in one line.
     */
    private boolean arePointInOneLine(Point p1, Point p2, Point p3) {
        return (p1.getPointX() - p3.getPointX())
                * (p2.getPointY() - p3.getPointY()) == (p2.getPointX() - p3.getPointX())
                        * (p1.getPointY() - p3.getPointY());
    }

    /**
     * arePoint equals.
     */
    private boolean arePointEquals(Point p1, Point p2) {
        return p1.getPointX() == p2.getPointX() && p1.getPointY() == p2.getPointY();
    }

    /**
     * getP1.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * setP1.
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * getP2.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * setP2.
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * getP3.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * setP3.
     */
    public void setP3(Point p3) {
        this.p3 = p3;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return Math.abs((p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2.0);
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    // /**
    // * getInfo.
    // */
    // public String getInfo() {
    // return "Triagle[(" + p1.getPointX() + "," + p1.getPointY() + "),("
    // + p2.getPointX() + "," + p2.getPointY() + "),("
    // + p3.getPointX() + "," + p3.getPointY() + ")]";
    // }

    /**
     * getInfo.
     */
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX())
                + "," + String.format("%.2f", p1.getPointY())
                + "),(" + String.format("%.2f", p2.getPointX())
                + "," + String.format("%.2f", p2.getPointY())
                + "),(" + String.format("%.2f", p3.getPointX())
                + "," + String.format("%.2f", p3.getPointY())
                + ")]";
    }
}

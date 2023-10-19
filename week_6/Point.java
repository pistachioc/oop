
public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Getters X.
     */
    public double getPointX() {
        return pointX;
    }
    
    /**
     * Setters X.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Getters Y.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Setters Y.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Distance between two points.
     */
    public double distance(Point point) {
        return Math.sqrt(Math.pow(pointX - point.getPointX(), 2) 
                + Math.pow(pointY - point.getPointY(), 2));
    }
    
    /**
     * Equals.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return Math.abs(pointX - point.getPointX()) < 0.001
                     && Math.abs(pointY - point.getPointY()) < 0.001;
        }
        return false;
    }

    /**
     * Hashcode.
     */
    @Override
    public int hashCode() {
        return (int) (pointX + pointY);
    }

    /**
     * To string.
     */
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}

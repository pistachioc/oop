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
     * getPointX.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * getPointY.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * setPointX.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * setPointY.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */
    public double distance(Point p) {
        return Math.sqrt((pointX - p.getPointX()) * (pointX - p.getPointX())
                + (pointY - p.getPointY()) * (pointY - p.getPointY()));
    }

}

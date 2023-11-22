public abstract class Piece {
    
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Constructor.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }
    
    /**
     * Constructor.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * getCoordinatesX.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * setCoordinatesX.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * getCoordinatesY.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * setCoordinatesY.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * getColor.
     */
    public String getColor() {
        return color;
    }

    /**
     * setColor.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getSymbol.
     */
    public abstract String getSymbol();

    /**
     * canMove.
     */
    public abstract boolean canMove(Board board, int x, int y);
}

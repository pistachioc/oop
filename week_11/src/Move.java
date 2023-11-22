import java.util.HashMap;

public class Move {
    
    private Piece movedPiece;
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece killedPiece;

    private HashMap<Integer, String> maps = new HashMap<Integer, String>() {
        {
            put(1, "a");
            put(2, "b");
            put(3, "c");
            put(4, "d");
            put(5, "e");
            put(6, "f");
            put(7, "g");
            put(8, "h");
        }
    };

    /**
     * Constructor.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Constructor.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * toString.
     */
    public String toString() {
        String x = maps.get(this.endX);
        String y = Integer.toString(this.endY);
        String color = this.movedPiece.getColor();
        String symbol = this.movedPiece.getSymbol();
        return color + "-" + symbol + x + y;
    }
    
    /**
     * getStartX.
     */
    public int getStartX() {
        return this.startX;
    }

    /**
     * getStartY.
     */
    public int getStartY() {
        return this.startY;
    }

    /**
     * getEndX.
     */
    public int getEndX() {
        return this.endX;
    }

    /**
     * getEndY.
     */
    public int getEndY() {
        return this.endY;
    }

    /**
     * setStartX.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * setStartY.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * setEndX.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * setEndY.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * getMovedPiece.
     */
    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    /**
     * setMovedPiece.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * getKilledPiece.
     */
    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    /**
     * setKilledPiece.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}

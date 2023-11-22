import java.util.ArrayList;

public class Board {
    
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * validate.
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && x < WIDTH && y >= 1 && y < HEIGHT);
    }

    /**
     * addPiece.
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
                pieces.add(piece);
            }
        }
    }

    /**
     * getAt.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * removeAt.
     */
    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                break;
            }
        }
    }

    /**
     * getPieces.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * setPieces.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}

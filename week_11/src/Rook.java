public class Rook extends Piece {

    /**
     * Constructor.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * getSymbol.
     */
    public String getSymbol() {
        return "R";
    }

    /**
     * canMove.
     */
    public boolean canMove(Board board, int x, int y) {
        if (x == this.getCoordinatesX()) {
            if (y > this.getCoordinatesY()) {
                for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                for (int i = this.getCoordinatesY() - 1; i > y; i--) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else if (y == this.getCoordinatesY()) {
            if (x > this.getCoordinatesX()) {
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}

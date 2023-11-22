import java.util.ArrayList;

public class Game {
    
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Constructor.
     */
    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<Move>();
    }
    
    /**
     * movePiece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(this.board, x, y)) {
            Move newMove = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            if (this.board.getAt(x, y) != null) {
                Piece pieceAtDestination = this.board.getAt(x, y);
                newMove.setKilledPiece(pieceAtDestination);
                this.board.removeAt(x, y);
                this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                this.board.addPiece(piece);
            } else {
                this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                this.board.addPiece(piece);
            }
            this.moveHistory.add(newMove);
        }
    }

    /**
     * getBoard.
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * getMoveHistory.
     */
    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }

    /**
     * setMoveHistory.
     */
    public void setMoveHistory(ArrayList<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    /**
     * setBoard.
     */
    public void setBoard(Board board) {
        this.board = board;
    }
}

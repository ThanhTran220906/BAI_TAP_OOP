import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * Game constructor 1.
     */
    public Game(Board board) {
        this.moveHistory = new ArrayList<>();
        this.board = board;
    }

    /**
     * Game constructor 2.
     */
    public Game() {
        board = new Board();
        moveHistory = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * move piece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece pieceAt = board.getAt(x, y);
            if (pieceAt != null) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece, pieceAt));
                board.removeAt(x, y);
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece));
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }
}

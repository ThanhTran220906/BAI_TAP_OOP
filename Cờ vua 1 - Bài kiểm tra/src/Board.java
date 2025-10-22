import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    /**
     * Board constructor 1.
     */
    public Board() {
        this.pieces = new ArrayList<>();
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    /**
     * validate position.
     */
    public boolean validate(int x, int y) {
        return (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
    }

    /**
     * add Piece.
     */
    public void addPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();

        for (Piece p : pieces) {
            if ((p.getCoordinatesX() == x) && (p.getCoordinatesY() == y)) {
                return;
            }
        }
        pieces.add(piece);
    }

    /**
     * return piece at (x, y).
     */
    public Piece getAt(int x, int y) {
        for (Piece p : pieces) {
            if ((p.getCoordinatesX() == x) && (p.getCoordinatesY() == y)) {
                return p;
            }
        }
        return null;
    }

    /**
     * remove piece at (x, y).
     */
    public void removeAt(int x, int y) {
        Piece pieceAt = this.getAt(x, y);
        if (pieceAt != null) {
        pieces.remove(pieceAt);
        }
    }
}

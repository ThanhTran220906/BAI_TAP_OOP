import java.util.Objects;

public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        int xcurrent = this.getCoordinatesX();
        int ycurrent = this.getCoordinatesY();

        if ((xcurrent == x && ycurrent == y) || (xcurrent != x && ycurrent != y)) {
            return false;
        }

        Piece pieceAt = board.getAt(x, y);
        if (pieceAt != null && Objects.equals(pieceAt.getColor(), this.getColor())) {
            return false;
        }

        if (xcurrent == x) {
            int dy = (ycurrent < y) ? 1 : -1;
            for (int i = ycurrent + dy; i != y; i += dy) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else { // (_y == y)
            int dx = xcurrent < x ? 1 : -1;
            for (int i = xcurrent + dx; i != x; i += dx) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }

        return true;
    }
}

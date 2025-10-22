import java.util.Objects;

public class Bishop extends Piece {
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        // dich khong thuoc ban co
        if (!board.validate(x, y)) {
            return false;
        }
        int xcurrent = this.getCoordinatesX();
        int ycurrent = this.getCoordinatesY();
        // co the di
        if (Math.abs(xcurrent - x) != Math.abs(ycurrent - y)) {
            return false;
        }
        // tai o dich co quan nao
        Piece pieceAt = board.getAt(x, y);
        if (pieceAt != null && Objects.equals(pieceAt.getColor(), this.getColor())) {
            return false; // cung mau thi khong duoc
        }
        // tu o hien tai den o dich
        int dy = (ycurrent < y) ? 1 : -1;
        int dx = xcurrent < x ? 1 : -1;
        for (int i = ycurrent + dy, j = xcurrent + dx; i != y; i += dy, j += dx) {
            if (board.getAt(j, i) != null) {
                return false;
            }
        }
        return true;
    }
}

public class Square extends Rectangle {
    /**
     * Shape constructor 1.
     */
    public Square() {
    }

    /**
     * Shape constructor 2.
     *
     * @param side side
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Shape constructor 3.
     *
     * @param side side
     * @param color color
     * @param filled filler
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    /**
     * Square to string.
     */
    @Override
    public String toString() {
        return "Square[side=" + this.width
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}

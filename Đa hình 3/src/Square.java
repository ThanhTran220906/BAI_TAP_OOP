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

    /**
     * Shape constructor 4.
     *
     * @param topLeft top left point
     * @param side side
     * @param color color
     * @param filled filler
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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

    public Square(double width, double length) {
        super(width, length);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Square)) {
            return false;
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Square to string.
     */
    @Override
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.length,
                this.color,
                this.filled);
    }
}

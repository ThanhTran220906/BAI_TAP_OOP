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
     * Shape constructor 2.
     *
     * @param centerPoint center point
     * @param side side
     */
    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
    }


    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return this.length;
    }

    @Override
    public String getName() {
        return "Hình vuông";
    }
}

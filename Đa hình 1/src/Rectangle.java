public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Shape constructor 1.
     */
    public Rectangle() {
        super();
    }

    /**
     * Shape constructor 2.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Shape constructor 3.
     *
     * @param color  color
     * @param filled filler
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * get area.
     */
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * get perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    /**
     * Rectangle to string.
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}

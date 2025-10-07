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
     * @param width width
     * @param length length
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Shape constructor 3.
     * @param centerPoint center point
     * @param width width
     * @param length length
     */
    public Rectangle(Point centerPoint, double width, double length) {
        super(centerPoint);
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

    public String getName() {
        return "Hình chữ nhật";
    }
}

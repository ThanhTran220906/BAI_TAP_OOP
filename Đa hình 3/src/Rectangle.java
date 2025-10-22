import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

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
     * @param color color
     * @param filled filler
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Shape constructor 4.
     *
     * @param color color
     * @param filled filler
     * @param topLeft top left point
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return Double.compare(width, rectangle.width) == 0
                && Double.compare(length, rectangle.length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    /**
     * Rectangle to string.
     */
    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.width,
                this.length,
                this.color,
                this.filled);
    }
}

import static java.lang.Math.PI;

public class Circle extends Shape {
    protected double radius;

    /**
     * Circle constructor 1.
     */
    public Circle() {
        super();
    }

    /**
     * Circle constructor 2.
     *
     * @param radius radius
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Circle constructor 3.
     *
     * @param centerPoint center point
     * @param radius radius
     */
    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get circle area.
     */
    @Override
    public double getArea() {
        return this.radius * this.radius * PI;
    }

    /**
     * get Circle perimeter.
     */
    @Override
    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

    public String getName() {
        return "Hình tròn";
    }
}

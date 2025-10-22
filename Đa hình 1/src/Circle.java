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
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Circle constructor 3.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
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

    /**
     * Circle to string.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}

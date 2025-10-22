import static java.lang.Math.PI;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

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

    /**
     * Circle constructor 4.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
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


    public void move() {

    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) object;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }

    /**
     * Circle to string.
     */
    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                this.center.toString(),
                this.radius,
                this.color,
                this.filled);
    }
}

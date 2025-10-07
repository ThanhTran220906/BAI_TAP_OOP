public class Circle {
    private double radius;
    private String color;
    protected final double pi;

    /**
     * Circle constructor 1.
     */
    public Circle() {
        this.pi = 3.14;
        this.radius = 0;
        this.color = "";
    }

    /**
     * Circle constructor 2.
     */
    public Circle(double radius) {
        this.pi = 3.14;
        this.radius = radius;
        this.color = "";
    }

    /**
     * Circle constructor 3.
     */
    public Circle(double radius, String color) {
        this.pi = 3.14;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get area of circle.
     */
    public double getArea() {
        double res = this.pi * this.radius * this.radius;
        return res;
    }

    /**
     * Circle to String.
     */
    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f,color=%s]", this.radius, this.color);
    }
}

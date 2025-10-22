public class Cylinder extends Circle {
    private double height;

    /**
     * Cylinder constructor 1.
     */
    public Cylinder() {
        super();
        height = 0;
    }

    /**
     * Cylinder constructor 2.
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /**
     * Cylinder constructor 3.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Cylinder constructor 4.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    /**
     * Cylinder to String.
     */
    @Override
    public String toString() {
        return "[Cylinder" + super.toString() + ",height=" + height + ']';
    }

    @Override
    public double getArea() {
        return 2 * (super.getArea() + this.getRadius() * this.height * this.pi);
    }
}



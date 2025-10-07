public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Shape constructor 1.
     */
    public Shape() {
        this.color = "null";
        this.filled = false;
    }

    /**
     * Shape constructor 2.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * get area.
     */
    public abstract double getArea();

    /**
     * get perimeter.
     */
    public abstract double getPerimeter();

    /**
     * Shape to string.
     */
    @Override
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}

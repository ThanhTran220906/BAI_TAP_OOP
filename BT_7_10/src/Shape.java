import java.util.ArrayList;

public class Shape {
    private Point centerPoint;
    private static int count = 0;

    public Shape() {
        count++;
    }

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public static int getCount() {
        return count;
    }

    /**
     * get area.
     */
    public abstract double getArea();

    /**
     * get perimeter.
     */
    public double getPerimeter() {
        return 0;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return getName() + " | Tâm: " + centerPoint +
                " | Diện tích: " + String.format("%.2f", getArea()) +
                " | Chu vi: " + String.format("%.2f", getPerimeter());
    }
}

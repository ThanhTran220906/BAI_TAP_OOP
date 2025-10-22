import static java.lang.Math.sqrt;

import java.util.Objects;


public class Point {
    private double pointX;
    private double pointY;

    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point newPoint) {
        return sqrt((this.pointX - newPoint.getPointX()) * (this.pointX - newPoint.getPointX())
                + (this.pointY - newPoint.getPointY()) * (this.pointY - newPoint.getPointY()));
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Point)) {
            return false;
        }
        Point point = (Point) object;
        return Double.compare(pointX, point.pointX) == 0
                && Double.compare(pointY, point.pointY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)",
                this.pointX, this.pointY);
    }
}

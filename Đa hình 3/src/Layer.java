import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Layer extends JPanel {
    private List<Shape> shapes;
    private Graphics g;
    /**
     * layer constructor.
     */
    public Layer() {
        this.shapes = new ArrayList<>();
    }

    /**
     * add shape.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * remove circle.
     */
    public void removeCircles() {
        shapes.removeIf(s -> s instanceof Circle);
    }

    /**
     * get info of shape list.
     */
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Layer of crazy shapes:");
        for (Shape shape : shapes) {
            s.append("\n").append(shape.toString());
        }
        return s.toString();
    }

    /**
     * remove duplicate shape.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (Objects.equals(shapes.get(i), shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}

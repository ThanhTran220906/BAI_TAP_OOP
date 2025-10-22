import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Khởi tạo các hình
        shapes.add(new Rectangle(new Point(0, 0), 4, 6));
        shapes.add(new Square(new Point(2, 2), 5));
        shapes.add(new Circle(new Point(-1, 3), 3));

        // 1. Số lượng hình đã khởi tạo
        System.out.println("Tổng số hình đã khởi tạo: " + Shape.getCount());
        System.out.println("-----------------------------------");

        // 2. Danh sách chi tiết các hình
        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(" - " + s);
        }
        System.out.println("-----------------------------------");

        // 3. Danh sách tâm điểm
        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(" - " + s.getName() + " có tâm tại " + s.getCenterPoint());
        }
    }
}

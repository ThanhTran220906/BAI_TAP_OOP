import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Tạo vài Student
        Student s1 = new Student("Nguyễn Văn A", "a.nv@example.com", "SV001");
        Student s2 = new Student("Trần Thị B", "b.tt@example.com", "SV002");
        Student s3 = new Student("Lê Văn C", "c.lv@example.com", "SV003");
        Student s4 = new Student("Phạm Thị D", "d.pt@example.com", "SV004");

        // Tạo vài Teacher và Advisor
        Teacher t1 = new Teacher("PGS. Dr. Hoàng Minh", "minh.h@example.edu", "GV101", "PGS");
        Teacher t2 = new Teacher("TS. Nguyễn Thị Lan", "lan.nt@example.edu", "GV102", "TS");
        Advisor a1 = new Advisor("Dr. John Smith", "john.smith@external.edu");
        Advisor a2 = new Advisor("Prof. Maria Garcia", "maria.g@research.org");

        // Tạo các khoá luận (Student + (Teacher|Advisor) + title)
        KLTN<Student, Teacher> k1 = new KLTN<>(s1, t1, "Mạng nơ-ron trong nhận dạng ảnh");
        KLTN<Student, Advisor> k2 = new KLTN<>(s2, a1, "Ứng dụng học máy cho dự báo thời tiết");
        KLTN<Student, Teacher> k3 = new KLTN<>(s3, t2, "Phân tích hiệu năng thuật toán sắp xếp");
        KLTN<Student, Advisor> k4 = new KLTN<>(s4, a2, "Khảo sát các phương pháp tối ưu hoá");

        // Comparator sắp xếp theo chữ cái đầu của tên khoá luận (case-insensitive)
        Comparator<KLTN<?, ?>> byFirstCharTitle = (o1, o2) -> {
            String tA = o1.getTitle();
            String tB = o2.getTitle();
            if (tA == null) tA = "";
            if (tB == null) tB = "";
            // Lấy ký tự đầu tiên có nghĩa (bỏ khoảng trắng đầu)
            char c1 = firstSignificantChar(tA);
            char c2 = firstSignificantChar(tB);
            return Character.toLowerCase(c1) - Character.toLowerCase(c2);
        };

        // Tạo ListSortable chứa KLTN
        ListSortable<KLTN<?, ?>> list = new ListSortable<>(byFirstCharTitle);
        list.add(k1);
        list.add(k2);
        list.add(k3);
        list.add(k4);

        // In kết quả (đã sắp xếp theo chữ cái đầu của title)
        System.out.println("Danh sách khoá luận (sắp xếp theo chữ cái đầu của tên khoá luận):");
        list.print();
    }

    private static char firstSignificantChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isWhitespace(ch)) return ch;
        }
        return '\0';
    }
}
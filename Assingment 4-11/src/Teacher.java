public class Teacher extends Person {
    private String title; // chức danh (ví dụ: "PGS", "TS", "Giảng viên")

    public Teacher(String fullname, String email, String id, String title) {
        super(fullname, email, id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (ID: %s, email: %s)",
                getFullname(), title, getId(), getEmail());
    }
}
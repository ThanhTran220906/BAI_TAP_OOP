public class KLTN<T extends Person, V extends Person> {
    private T student;
    private V supervisor;
    private String title;

    public KLTN(T student, V supervisor, String title) {
        this.student = student;
        this.supervisor = supervisor;
        this.title = title;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("'%s' — Sinh viên: %s; Người hướng dẫn: %s",
                title, student.toString(), supervisor.toString());
    }
}
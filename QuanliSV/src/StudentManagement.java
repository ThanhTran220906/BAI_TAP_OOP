public class StudentManagement {

    private Student[] students;
    private int count;

    public StudentManagement() {
        students = new Student[100];
        count = 0;
    }

    /**
     * Ham add Student vao SM.
     */
    public void addStudent(Student newStudent) {
        if (count < students.length) {
            students[count] = newStudent;
            count++;
        }
    }

    /**
     * Ham in Student theo group.
     */
    public String studentsByGroup() {
        String result = "";
        boolean[] printedGroup = new boolean[count];
        for (int i = 0; i < count; i++) {
            String group = students[i].getGroup();
            boolean groupPrinted = false;
            for (int j = 0; j < i; j++) {
                if (students[j].getGroup().equals(group)) {
                    groupPrinted = true;
                    break;
                }
            }
            if (!groupPrinted) {
                result += group + "\n";
                for (int k = 0; k < count; k++) {
                    if (students[k].getGroup().equals(group)) {
                        result += students[k].getInfo() + "\n";
                    }
                }
            }
        }
        return result;
    }

    /**
     * Ham xóa sinh viên theo id.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                break;
            }
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Ham main de kiem tra.
     */
    public static void main(String[] args) {

    }
}

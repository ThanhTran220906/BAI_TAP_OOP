public class Person {
    private String fullname;
    private String email;
    private String id;

    public Person(String fullname, String email, String id) {
        this.fullname = fullname;
        this.email = email;
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        if (id != null) {
            return String.format("%s (ID: %s, email: %s)", fullname, id, email);
        } else {
            return String.format("%s (email: %s)", fullname, email);
        }
    }
}

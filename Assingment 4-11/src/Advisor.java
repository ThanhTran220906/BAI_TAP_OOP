public class Advisor extends Person {
    public Advisor(String fullname, String email) {
        super(fullname, email, null); // id = null
    }

    @Override
    public String toString() {
        return String.format("%s (External Advisor, email: %s)", getFullname(), getEmail());
    }
}
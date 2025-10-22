public class Person {
    private String name;
    private String address;

    /**
     * Person constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.name = "";
        this.address = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Person to String.
     */
    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]",
                this.name,
                this.address
        );
    }
}

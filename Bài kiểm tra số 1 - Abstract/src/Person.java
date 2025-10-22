import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Person constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    /**
     * add new vehicle to list.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(v -> Objects.equals(v.getRegistrationNumber(), registrationNumber));
    }

    /**
     * get vehicle info of person.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return String.format("%s has no vehicle!", this.name);
        } else {
            StringBuilder res = new StringBuilder();
            res.append(this.name).append(" has:\n\n");
            for (Vehicle v : vehicleList) {
                res.append(v.getInfo()).append("\n");
            }
            return res.toString();
        }
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
}

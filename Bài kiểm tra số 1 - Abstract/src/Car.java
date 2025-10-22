public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Car constructor.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get info of car.
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tNumber of Doors: " + this.numberOfDoors + "\n"
                + "\tBelongs to " + this.owner.getName() + " - " + this.owner.getAddress();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

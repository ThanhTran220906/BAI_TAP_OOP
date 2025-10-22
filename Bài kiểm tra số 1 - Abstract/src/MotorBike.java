public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * MotorBike constructor.
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * get info of motorbike.
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tHas Side Car: " + this.hasSidecar + "\n"
                + "\tBelongs to " + this.owner.getName() + " - " + this.owner.getAddress();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}

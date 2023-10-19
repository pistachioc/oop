public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * Constructor.
     */
    public MotorBike(String brand, String model, String regisrationNumber, 
                        Person owner, boolean hasSidecar) {
        super(brand, model, regisrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * ishasSidecar.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * sethasSidecar.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * getInfo.
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n" 
            + "\tBrand: " + brand + "\n" 
            + "\tModel: " + model + "\n" 
            + "\tRegistration Number: " + regisrationNumber + "\n" 
            + "\tHas Side Car: " + hasSidecar + "\n" 
            + "\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n";
    }    
}

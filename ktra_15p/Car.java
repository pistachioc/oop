public class Car extends Vehicle {

    private int numberOfDoors;

    /**
     * Constructor.
     */
    public Car(String brand, String model, String regisrationNumber,
                Person owner, int numberOfDoors) {
        super(brand, model, regisrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * getInfo.
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + brand + "\n" 
                + "\tModel: " + model + "\n"
                + "\tRegistration Number: " + regisrationNumber + "\n"
                + "\tNumber of Doors: " + numberOfDoors + "\n"
                + "\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n";
    }

    /**
     * getNumberOfDoors.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * setNumberOfDoors.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}

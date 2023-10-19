public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected String regisrationNumber;
    protected Person owner;

    /**
     * Constructor.
     */
    public Vehicle(String brand, String model, 
                    String regisrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.regisrationNumber = regisrationNumber;
        this.owner = owner;
    }
    
    /**
     * getInfo.
     */
    public abstract String getInfo();

    public void transferOwnership(Person person) {
        this.owner = person;
    }

    /**
     * getBrand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * setBrand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * getModel.
     */
    public String getModel() {
        return model;
    }

    /**
     * setModel.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * getRegistrationNumber.
     */
    public String getRegistrationNumber() {
        return regisrationNumber;
    }

    /**
     * setRegisrationNumber.
     */
    public void setRegisrationNumber(String regisrationNumber) {
        this.regisrationNumber = regisrationNumber;
    }

    /**
     * getOwner.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * setOwner.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
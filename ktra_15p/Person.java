public class Person {
    
    private String name;
    private String address;
    private java.util.List<Vehicle> vehicleList = new java.util.ArrayList<>();

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * addVehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicle.setOwner(this);
        vehicleList.add(vehicle);
    }

    /**
     * removeVehicle.
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(v -> v.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * getVehicleInfo.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            StringBuilder info = new StringBuilder(name + " has:\n\n");
            for (Vehicle vehicle : vehicleList) {
                info.append(vehicle.getInfo());
            }
            return info.toString();
        }
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return name + " " + address;
    }

    /**
     * getName.
     */
    public String getName() {
        return name;
    }
    
    /**
     * setName.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getAddress.
     */
    public String getAddress() {
        return address;
    }

    /**
     * setAddress.
     */
    public void setAddress(String address) {
        this.address = address;
    }

}

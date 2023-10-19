public class Main {
    public static void main(String[] args) {
        Person personA = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
        Person personB = new Person("Nguyen Van B", "123 Pham Hung, HN");
        
        Car car = new Car("Mercedes-Benz", "S400", "30A - 888.88", personA, 4);
        MotorBike motorBike = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", personB, false);
        
        personA.addVehicle(car);
        personA.addVehicle(motorBike);
        
        System.out.println(personA.getVehiclesInfo());
        
        car.transferOwnership(personB);
        System.out.println(personA.getVehiclesInfo());
        
        MotorBike motorBike2 = new MotorBike("Honda", "CBR500R", "29 - P2 123.45", personB, false);
        personB.addVehicle(motorBike2);
        
        System.out.println(personB.getVehiclesInfo());
    }
}
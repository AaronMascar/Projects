
package vehiclerentalprogram;

public class VehicleFactory {
    public static Car getCar(String bodytype, String reg, String make, String model){
        return new Car( bodytype, reg,  make,  model);
    }
    
    public static Van getVan(float storageCapacity, String reg, String make, String model){
        return new Van(storageCapacity, reg,  make,  model);
    }
}


package vehiclerentalprogram;


public class Van extends Vehicle {
    private float storageCapacity;

    public Van(float storageCapacity, String reg, String make, String model) {
        super(reg, make, model);
        this.storageCapacity = storageCapacity;
    }

    public float getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(float storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    
    
}

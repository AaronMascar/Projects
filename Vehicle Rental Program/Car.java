
package vehiclerentalprogram;

public class Car extends Vehicle {
    private String bodytype;

    public Car(String bodytype, String reg, String make, String model) {
        super(reg, make, model);
        this.bodytype = bodytype;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }
    
    
    
}

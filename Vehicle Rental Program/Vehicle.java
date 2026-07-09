
package vehiclerentalprogram;

public abstract class Vehicle {
    private String reg;
    private String make;
    private String model;

    public Vehicle(String reg, String make, String model) {
        this.reg = reg;
        this.make = make;
        this.model = model;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}

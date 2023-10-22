
package vehiclerentalprogram;

public class RentalAgreement {
 
 private Customer customer;
 private Vehicle vehicle;
 private String id;

    public RentalAgreement(String id,Customer customer, Vehicle vehicle) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.id= id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
 
}

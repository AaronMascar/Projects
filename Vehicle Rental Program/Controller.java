
package vehiclerentalprogram;
import java.util.ArrayList;

public class Controller {
    
    private static ArrayList<Customer>customers = new ArrayList<>();
    private static ArrayList<Vehicle>vehicles = new ArrayList<>();
    private static ArrayList<RentalAgreement>rentalAgreements = new ArrayList<>();
    
    public static void addCustomer(Customer c){
        customers.add(c);
    }
    
    public static void addVehicle(Vehicle v){
        vehicles.add(v);
    }
    
    public static void addRentalAgreement(RentalAgreement ra){
        rentalAgreements.add(ra);
    }
    
    public static Customer getCustomer(String customerID){
        for(Customer c:customers){
            if(c.getId().equals(customerID)){
                return c;
            }
        }
        return null;
    }
    public static Vehicle getVehicle(String reg){
        for(Vehicle v:vehicles){
            if(v.getReg().equals(reg)){
                return v;
            }
        }
     return null;
    }
    
     public static RentalAgreement getRentalAgreement(String rentalAgreementID){
        for(RentalAgreement ra:rentalAgreements){
            if(ra.getId().equals(rentalAgreementID)){
                return ra;
            }
        }
     return null;
    }
   
    public static void updateCustomers(String message){
        for(Customer c:customers){
            c.update(message);
        }
        for(Customer c:customers){
            System.out.println(c.getName()+""+ c.getMessage());
        }
            
    }
}

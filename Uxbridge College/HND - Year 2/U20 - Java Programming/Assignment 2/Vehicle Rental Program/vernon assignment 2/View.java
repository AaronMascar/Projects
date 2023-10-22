
package vehiclerentalprogram;
import java.util.Scanner;

public class View {
    boolean running = false;
    public void run(){
        int userSelection;
        Scanner userInput = new Scanner(System.in);
        running = true;
        
        while(running){
            System.out.println("Please select an option");
            System.out.println("1: Add a customer \n 2: find a customer \n 3: add a vehicle \n 4:show a vehicle \n" + "5: add rental agreement \n 6: print rental agreement \n 7: send message to customer \n 9:quit");
            userSelection = userInput.nextInt();
            
            switch(userSelection){
                case 1:
                    addCustomer();
                    break;
                    
                case 2:
                    showCustomer();
                    break;
                    
                case 3:
                    addVehicle();
                    break;
                    
                case 4:
                    showVehicle();
                    break;
                    
                case 5:
                    addRentalAgreement();
                    break;
                    
                case 6:
                    printRentalAgreement();
                    break;
                    
                case 7:
                    updateCustomers();
                    break;
                    
                case 9:
                    running=false;
                    break;
                    
                
            }//end of switch
        }//end of while loop
    }//end of run method
    
    public void addCustomer(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a customer ID");
        String customerId = userInput.nextLine();
        System.out.println("Enter a customer name");
        String customerName = userInput.nextLine();
        Controller.addCustomer(new Customer(customerName, customerId));
    }
    public void showCustomer(){
         Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a customer ID");
        String customerId = userInput.nextLine();
        Customer c = Controller.getCustomer(customerId);
        if(c != null){
            System.out.println(c.getId() + c.getName());
        }
        else{
            System.out.println("Customer not found");
        }
    }
    
    public void addVehicle(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("car or van?");
        String vehicleType = userInput.nextLine();
        System.out.println("Enter a vehicle registration");
        String reg = userInput.nextLine();
        System.out.println("Enter a vehicle make");
        String make = userInput.nextLine();
        System.out.println("Enter a vehicle model");
        String model = userInput.nextLine();
        if(vehicleType.equals("car")){
         String bodyType = userInput.nextLine();
         Controller.addVehicle(VehicleFactory.getCar(bodyType,reg,make,model));
        }
        else if(vehicleType.equals("Van")){
              Scanner floatInput = new Scanner(System.in);
            System.out.println("Enter storage capacity");
            Float storageCapacity = floatInput.nextFloat();
            Controller.addVehicle(VehicleFactory.getVan(storageCapacity, reg, make, model));
        }
        System.out.println("Vehicle added to database");
    }
    
    public void showVehicle(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input a registration number");
        String reg = userInput.nextLine();
        Vehicle vehicle = Controller.getVehicle(reg);
        if(vehicle !=null){
        if(vehicle instanceof Car){
            Car car = (Car)vehicle;
            System.out.println(car.getMake()+car.getModel()+car.getReg() + car.getBodytype());
        }
        else if(vehicle instanceof Van){
            Van van = (Van)vehicle;
            System.out.println(van.getMake()+van.getModel()+van.getReg() + Float.toString(van.getStorageCapacity()));
        }
        }
        else{
            System.out.println("Vehicle not found");
        }
    }
    
    public void addRentalAgreement(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter rental agreement id");
        String id =userInput.nextLine();
        System.out.println("Enter customer id");
        String customerID =userInput.nextLine();
        Customer c = Controller.getCustomer(customerID);
        System.out.println("Enter vehicle registration");
        String reg = userInput.nextLine();
       Vehicle v = Controller.getVehicle(reg);
       Controller.addRentalAgreement(new RentalAgreement(id,c,v));
    }
    public void printRentalAgreement(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter rental agreement id");
        String id =userInput.nextLine();
        RentalAgreement ra= Controller.getRentalAgreement(id);
        String details = ra.getId() +"\n"+ ra.getCustomer().getName() + "\n"+ ra.getVehicle().getMake() + ra.getVehicle().getModel() + ra.getVehicle().getReg();
        System.out.println(details);
    }
    public void updateCustomers(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type your message to the customers");
        String theMessage = userInput.nextLine();
        Controller.updateCustomers(theMessage);
    }
}//end of class

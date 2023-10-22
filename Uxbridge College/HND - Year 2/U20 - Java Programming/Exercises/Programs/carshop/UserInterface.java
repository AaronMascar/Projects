/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop;
import java.util.Scanner;
/**
 *
 * @author 40119755
 */
public class UserInterface {
    private Database db;
    private static UserInterface uiInstance = null;
    public UserInterface(Database db){
        this.db=db;
    }
    public static UserInterface getInstance(Database db){
        if(uiInstance == null){
            uiInstance =  new UserInterface(db);
        }
        return uiInstance;
    }
    public void run(){
        Scanner input=new Scanner(System.in);
        boolean running=true;
        int selection;
        while(running){
            System.out.println("Select an option");
             System.out.println("1. add car");
              System.out.println("2. add customer");
               System.out.println("3. print cars");
                System.out.println("4.  print customers");
                 System.out.println("5."
                         + ". quit program");
                 selection=input.nextInt();
        switch(selection){
            case 5:
                running=false;
                break;
            case 1:
                Car car = addCar();
                db.addCar(car);
                break;
            case 2:
                Customer customer=addCustomer();
                db.addCustomer(customer);
                break;
            case 3:
                db.printCars();
                break;
            case 4:
                db.printCustomers();
                break;
            
            default:
                System.out.println("Invalid option");
        }  
        }
    }
        public Car addCar(){
            Scanner input =new Scanner(System.in);
            String carMake, carModel,carReg;
            System.out.println("Enter car make");
            carMake=input.nextLine();
            System.out.println("Enter car model");
            carModel=input.nextLine();
            System.out.println("Enter car reg");
            carReg=input.nextLine();
            return new Car(carMake, carModel, carReg);
        }
        
        public Customer addCustomer(){
            Scanner input =new Scanner(System.in);
            String CustomerName;
            System.out.println("Enter Customer name");
            CustomerName=input.nextLine();
            return new Customer(CustomerName);
        }
}


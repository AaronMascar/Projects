package carshop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;


/**
 *
 * @author 40119755
 */
public class Database {
    private ArrayList<Car>cars = new ArrayList<>();
    private ArrayList<Customer>customers = new ArrayList<>();
   private static Database databaseInstance = null;
   
   public Database(){
   if(databaseInstance == null){
    databaseInstance = new Database();
    }  
   
   }
    public Car getCars(int i){
        return cars.get(i);
        
    }
    public void printCars(){
        for(int i = 0; i < cars.size(); i ++) {
            System.out.println( i + " " + cars.get(i).getDetails());
            
        }
    }
    public void addCustomers(Customer c){
        customers.add(c);
        
    }
    public Customer getCustomers(int i){
        return customers.get(i);
    }
    public void printCustomer(){
        for(int i = 0; i < customers.size(); i ++){
            System.out.println( i + " " + customers.get(i).getCustomerName());
        }
    }
}
    


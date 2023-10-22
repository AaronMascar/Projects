package carshop;


import carshop.Customer;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40082366
 */
public class Database {
    
    private ArrayList<Sale> sales = new ArrayList<>();
    
    public void addSale(Sale s) {
        sales.add(s);
    }
    public Sale getSale(int i) {
        return sales.get(i);
    }
    public void printSales() {
        for(Sale s: sales) { 
            Car car = s.getCar();
            Customer customer = s.getCustomer();
            System.out.println(customer.getCustomerName() + " "+ car.getDetails() );
        }
    }
}

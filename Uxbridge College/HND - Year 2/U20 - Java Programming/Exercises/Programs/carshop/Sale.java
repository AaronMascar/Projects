/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshop;

import java.util.Date;

/**
 *
 * @author 40119755
 */
public class Sale {

   
    private Customer customer;
    private Car car;
    private Date date;
    
    public Sale(Customer customer, Car car){
        this.customer=customer;
        this.car=car;
    }
    public Customer getCustomer(){
        return customer;
    }
    public Car getCar(){
        return car;
    }

   
        

    
}

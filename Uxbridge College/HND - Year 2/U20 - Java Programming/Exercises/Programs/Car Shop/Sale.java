package carshop;


import carshop.Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40082366
 */
public class Sale {
    private Customer customer;  
    private Car car;
    private Date date;
    
    public Sale (Customer boris, Car BMW, Date date) {
        this.customer = customer;
        this.car = car;
        this.date = date;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Car getCar() {
        return car;
    }        
    public Date getDate() {
        return date;
    }
}

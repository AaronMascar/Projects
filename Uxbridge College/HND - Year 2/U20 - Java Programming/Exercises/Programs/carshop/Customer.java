/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop;

/**
 *
 * @author 40119755
 */
public class Customer {
    private String CustomerName;
    public Customer(String customername){
        this.CustomerName=customername;
    }
    public String getCustomerName(){
        return CustomerName;
    }
}

package carshop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40082366
 */
public class CarShop {
    
    public static void main(String[] args) {

        Database db = new Database();
        
        Car twingo = new Car("fiat", "twingo", "qwe123", "BMW");
        Customer Doge = new Customer ("Doge Viper");        
        Customer aaron = new Customer ("Aaron Johnson");
        Customer adrian = new Customer ("Adrian Frenandez");
        Customer boris = new Customer ("Boris Johnson");
        Date date = new Date("10/12/2019");
        Sale s1 = new Sale (boris, twingo, date);
        Sale s2 = new Sale (adrian, fiat, date);
        Sale s3 = new Sale (aaron, BMW, date);
        Sale s4 = new Sale (Doge, qwe123, date);
        db.addSale(s1);
        db.printSales();
    }
}

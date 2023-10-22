/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshop;
/**
 *
 * @author 40082366
 */
public class Car {
    
    private String make;
    private String model;
    private String registration;
    public Car(String make, String model, String registration) {
        
        this.make = make;
        this.model = model;
        this.registration = registration;
    }
    public String getDetails() {
        return make + " "+ model + " "+ registration;
    }
}

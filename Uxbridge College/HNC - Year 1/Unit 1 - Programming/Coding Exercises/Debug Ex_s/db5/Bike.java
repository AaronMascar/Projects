/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db5;

/**
 *
 * @author 40082366
 */
public class Bike {
    
    /** Bike class (Bike.java)**/
//fields (instance variables)
    int gear;
    int speed;
//methods
    public void speedUp(){
        speed++;
    }
    public void speedDown(){
        speed--;
    }
    public void gearUp(){
    }
    public void gearDown(){
        gear--;
    }    
        
    public void print(){
        
        bmx.gear = 1;
        bmx.speed = 1;
        
        bmx.print();
        
        
        
        System.out.println("Current Gear: " + gear);
        System.out.println("Current  Speed :" + speed);
      
    }
}


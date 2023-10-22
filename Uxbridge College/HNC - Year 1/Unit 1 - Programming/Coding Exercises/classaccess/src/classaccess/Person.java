/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classaccess;

/**
 *
 * @author 40082366
 */
public class Person {
    private int arms;
    private int legs;
    
    public
    //setter function lets the programmer change the value of the arms variable.
    void setArms(int ta){
        arms = ta;
    }
    
    //getter function returns the value of teh arms variable.
    int getArms(){
        return arms;
    }
    
    //setter function lets the programmer change the value of the arms variable.
    void setLegs(int tb){
        legs = tb;
    }
    
    //getter function returns the value of teh arms variable.
    int getLegs(){
        return legs;
    }

}

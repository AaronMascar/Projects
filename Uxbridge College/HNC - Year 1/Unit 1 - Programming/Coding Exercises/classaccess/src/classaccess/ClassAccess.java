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
public class ClassAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person tim = new Person(); // create a new instance of the persons and allocates it into the memory
        
        tim.setArms(10);
        tim.setLegs(2);
        
        System.out.println(tim.getArms());
        System.out.println(tim.getLegs());
    }
    
}

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
public class CarShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database db =new Database();
          Database dbi =new Database();
        UserInterface ui= new UserInterface(db);
           UserInterface uii= new UserInterface(dbi);
        ui.run();
        uii.run();
      
        
     
       
    }
    
}

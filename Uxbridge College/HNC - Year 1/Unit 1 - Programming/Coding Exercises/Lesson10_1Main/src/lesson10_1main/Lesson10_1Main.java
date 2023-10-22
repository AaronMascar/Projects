/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10_1main;

/**
 *
 * @author 40082366
 */
public class Lesson10_1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Chair myChair = new Chair();
        Chair yourChair = new Chair("Sofa");
        
        myChair.print();
        yourChair.print();
        yourChair.print(20);
    }
    
}

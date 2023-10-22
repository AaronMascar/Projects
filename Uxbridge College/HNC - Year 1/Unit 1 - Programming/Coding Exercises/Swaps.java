/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swaps;

/**
 *
 * @author 40082366
 */
public class Swaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int a = 10;
        int b = 20;
        int c = 0;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        
     //Swaps
        c = a;
        a = b;
        b = c;


        
        System.out.println("\n" +"A = " + a);
        System.out.println("B = " + b);
        
        
    //Swaps without c
        a = a + b;
        b = a - b;
        a = a + b;
        
        System.out.println(a);
        System.out.println(b);
    }
    
}

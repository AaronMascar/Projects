/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsex1;

/**
 *
 * @author 40082366
 */
public class OperatorsEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       float a = 10;
       float b = 20;
  
       float c;
        c = (-b/a);
        
       if (a>b){
           System.out.println("a is greater than b");
       }
       
       if (b!=c){
              System.out.println("b is equal to c");
       }
       
       if (a==c){
              System.out.println("a is equal to c");
       }
       
       System.out.println("B / A = " + (int)c);
       System.out.println((int)++a);
       System.out.println((int)--b);
        
    }
    
}

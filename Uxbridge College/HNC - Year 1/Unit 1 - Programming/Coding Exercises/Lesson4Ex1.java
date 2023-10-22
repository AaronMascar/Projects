/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4ex1;
import java.util.Scanner;
/**
 *
 * @author 40082366
 */
public class Lesson4Ex1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
                
        int max;
        int min;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number : ");
            num1 = sc.nextInt();

        System.out.println("Enter 2nd number : ");
            num2 = sc.nextInt();
        
        System.out.println("Enter 3rd number : ");
            num3 = sc.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The 1st number is the biggest than both that is " +num1);
            if (num2 > num3) {
                System.out.println("The 2nd largest number is: " + num2);
                System.out.println("The 3rd largest number is: " + num3);
            }
            else {
                System.out.println("The 2nd largest number is: " + num3);
                System.out.println("The 3rd largest number is: " + num2);
            }
            
        }
        
        else if (num2 >= num3 && num2 >= num1){
            System.out.println("The 1st number is the biggest than both that is " +num2);
            if (num3 > num1) {
                System.out.println("The 2nd largest number is: " + num3);
                System.out.println("The 3rd largest number is: " + num1);
            }
            else {
                System.out.println("The 2nd largest number is: " + num1);
                System.out.println("The 3rd largest number is: " + num3);
            }
        }

        else if (num3 >= num1 && num3 >= num2)
            System.out.println("The 1st number is the biggest than both that is " +num3);
        
    }
    
}

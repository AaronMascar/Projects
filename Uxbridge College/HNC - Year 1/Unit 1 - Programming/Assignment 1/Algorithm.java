/*

 */
package lesson4ex1;

/**
 *
 * @author a2-mascarenhas
 */
import java.util.Scanner;

public class Algorithm {

     public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
         int num;
         int highest = Integer.MIN_VALUE;
         int lowest = Integer.MAX_VALUE;
         int counter = 1;
         
         for (int i=0; i<6; i++){
         i = counter;
         System.out.print((counter++)+") Enter a number: ");
         num = scan.nextInt();
         
         
         
        if (num > 10) { 
         System.out.println("Not valid");
         counter = counter-1;
    }   
        else if (num < 0) { 
         System.out.println("Not valid");
         counter = counter-1;
    } 
        if (num > highest) {             
        highest = num;
    }
        else if (num < lowest)  {             
        lowest = num;
    }
         }
         
         System.out.println("\n" + "The highest / Lowest no. :");
         System.out.println("Highest number is: " + highest);
         System.out.println("Lowest number is: " + lowest);
        
    }
}
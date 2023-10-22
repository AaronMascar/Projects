/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db4;

/**
 *
 * @author 40082366
 */
import java.util.Scanner;
public class Db4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number;
        int choice;

        while (true) {
            System.out.print("Enter a number: ");
            number = s.nextInt();

            System.out.println("Choose an operation: ");
            System.out.println("1: double it ");
            System.out.println("2: halve it ");
            System.out.println("3: triple it ");
            System.out.println("0: quit");
            choice = s.nextInt();

            switch(choice){
              case 1:
                number = number*2;
                break;

              case 2:
                number = number/2;
                break;

              case 3:
                number = number*3;
                break;

              case 0:
                  break;
            }
            System.out.println("your number is now: " + number);
        }

    }
    
}

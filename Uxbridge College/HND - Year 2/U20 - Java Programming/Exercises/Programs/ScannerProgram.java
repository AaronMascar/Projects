/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programs;

/**
 *
 * @author 40082366
 */

import java.util.Scanner;

public class ScannerProgram {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float width;
        float height;
        float depth;
        
        System.out.println("please input the width");
        width = input.nextFloat();
        System.out.println("please input the height");
        height = input.nextFloat();
        System.out.println("please input the height");
        depth = input.nextFloat();
        
        float volume = (width * height * depth);
        
        System.out.println("The volume of the cuboid is " + volume);
    }
}

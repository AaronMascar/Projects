/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author 40082366
 */
public class Methodex {
    int myHeight = 10;
    int myWidth = 15;
    int area = getArea(myHeight, myWidth);

    public static int getArea(int myHeight,int myWidth) {
    
        int area = myHeight * myWidth;
        System.out.println("Area = " + area);   
        return area;
    }
}
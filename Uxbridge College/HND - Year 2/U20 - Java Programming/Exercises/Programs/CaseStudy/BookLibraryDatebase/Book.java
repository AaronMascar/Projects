/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookLibraryDatebase;

/**
 *
 * @author 40082366
 */
public class Book {
     
    //class attributes
     private int id;
     private String BookName;
     private String AuthorName;
     
     //constructor method
     public Book(int id, String bName, String aName) {    
     
         this.id = id;
         BookName = bName;
         AuthorName = aName; 
     }
     
     //getter method 
     public String getDetails() {
      
         String details = id + " " + BookName + " " + AuthorName + " ";
         return details;
    }
}

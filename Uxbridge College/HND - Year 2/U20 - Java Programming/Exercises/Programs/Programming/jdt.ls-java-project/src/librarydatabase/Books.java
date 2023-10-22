/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarydatabase;

/**
 *
 * @author 40109233
 */
public class Books extends Resource{
    
     private int id;
     private String bookName;
     private String authorName;
     
     //constructor method
     public Books(int id, String  bName, String AName) {    
     
         this.id = id;
         bookName = bName;
         authorName = AName; 
     }
    
    //getter method 
     public String getDetails() {
      
         String details = id + " " + bookName + " " + authorName;
         return details;
        }
     //setter
     public void setAuthor(String authorName){
         this.authorName = authorName;
     }
    }
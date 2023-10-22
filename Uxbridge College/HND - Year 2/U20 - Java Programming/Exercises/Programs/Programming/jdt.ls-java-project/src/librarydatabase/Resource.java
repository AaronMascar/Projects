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
    
     private int author;
     private String topic;
     private String synopsis;
     
     //constructor method
     public Books(String title, String author, String topic, String sysnopsis, String dateOfPublication) {    
     
        super(title, dateOfPublication);
         this.author = author;
         this.topic = topic;
         this.synopsis = sypnopsis; 
     }
    
    //Override
     public String getDetails() {
      
         return super.getDetails() , " ", author , " " , topic  , " " ,synopsis;

       }
    }
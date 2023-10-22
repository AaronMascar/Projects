/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic.pkgclass;

/**
 *
 * @author 40082366
 */
public class Student {

     //class attributes
     private int id;
     private String firstName;
     private String lastName;
     private String course;
     
     //constructor method
     public Student(int id, String  fName, String lName, String course) {    
     
         this.id = id;
         firstName = fName;
         lastName = lName;
         this.course = course; 
     }
     
     //getter method 
     public String getDetails() {
      
         String details = id + " " + firstName + " " + lastName + " " + course;
         return details;
        }
     //setter
     public void setCourse(String course){
         this.course = course;
     }
}

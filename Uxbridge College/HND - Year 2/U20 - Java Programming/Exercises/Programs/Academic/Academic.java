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
public class Academic {

    private int id;
    private String firstName;
    private String lastName;
    private String subjectTaught;
    
    public Academic(int id, String firstName, String lastName, String subjectTaught) {
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectTaught = subjectTaught;
    }
    
    public String getDetails() {
        String details = id + " " + firstName + " " + lastName + " " + subjectTaught;
        return details;
    }
    public int getID() {
        return this.id;
    }
    //setter method
    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setID(int id){
        this.id=id;
    }
}
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
public class Member {
        
    private int id;
    private String firstName;
    private String lastName;
    
    public Member(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getDetails() {
        String details = id + " " + firstName + " " + lastName;
        return details;
    }
    
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setID(int id) {
        this.id = id;
    }
}

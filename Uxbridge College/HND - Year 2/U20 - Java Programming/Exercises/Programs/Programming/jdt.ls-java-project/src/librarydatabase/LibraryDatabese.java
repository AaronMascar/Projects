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
import java.util.ArrayList;
public class LibraryDatabase {
    
    public static void main(String[] srgs) {
        
        Student aaron = new Student(1, "Aaron", "Mascarenhas", "Java");
        Student adrian = new Student(2, "Adrian", "Fernandez", "Database");
        Student Osric = new Student(3, "Osric", "Carvalo", "Artificial Intelligence");
        ArrayList<Student>students = new ArrayList<>();
        students.add(aaron);
        students.add(adrian);
        students.add(Osric);
        
        for(int i = 0; i < students.size(); i++) {
            Student currentStudent  = students.get(i);
            System.out.println(currentStudent.getDetails());
        //now create 2 more student objects and print their detials
        }
    }
}
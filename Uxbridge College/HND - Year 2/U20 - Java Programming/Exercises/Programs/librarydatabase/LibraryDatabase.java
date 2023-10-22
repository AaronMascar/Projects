package librarydatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDatabase {

	public static void main(String[] args) {
		
	
		Student vernon = new Student(1, "Aaron", "Mascarenhas", "Java Programming");
		String vernonsDetails;
		vernonsDetails = vernon.getDetails();
		System.out.println(vernonsDetails);
		
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a Member's name");
		
	}
}
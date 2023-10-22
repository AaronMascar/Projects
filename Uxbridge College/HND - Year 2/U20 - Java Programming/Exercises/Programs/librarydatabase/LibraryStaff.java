package librarydatabase;

public class LibraryStaff extends Member {	
	//attributes
	String jobTitle;	
	//constructor method
	public LibraryStaff(int id, String firstName, String lastName, String jobTitle) {
		super(id, firstName, lastName);
		this.jobTitle = jobTitle;
	}
	
	//getter and setter methods
	public Book buyBook(String title, String author, String topic, String synopsis, String dateOfPublication){
		
		return new Book(title, author, topic, synopsis, dateOfPublication);		
	}
	@Override
	public String getDetails(){
		
		String details = super.getDetails() + jobTitle;
		return details;
	}
}

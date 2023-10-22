package librarydatabase;

public class Student extends Member {
	
	private String course;	
	//constructor method
	public Student(int id, String firstName, String lastName, String course) {		
		super(id, firstName, lastName);
		this.course = course;		
	}	
	//setter method
	public void setCourse(String course) {
		this.course = course;
	}
	//overriden method
	@Override
	public String getDetails() {		
		String details = super.getDetails() + " " + course;
		return details;
	}
}
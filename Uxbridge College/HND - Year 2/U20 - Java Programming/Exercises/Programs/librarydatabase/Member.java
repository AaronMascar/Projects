package librarydatabase;

public abstract class Member {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Member(int id, String firstName, String lastName) {		
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
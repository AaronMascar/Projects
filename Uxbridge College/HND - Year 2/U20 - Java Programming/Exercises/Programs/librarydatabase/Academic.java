package librarydatabase;

public class Academic extends Member{
	
	private String subjectTaught;
	//constructor
	public Academic(int id, String firstName, String lastName, String subjectTaught) {
		
	//pass the argument to the constructor method of the super class (member)
		super(id, firstName, lastName);
		this.subjectTaught = subjectTaught;
	}	
	//setter method
	public void setSubjectTaught(String subjectTaught) {
		this.subjectTaught = subjectTaught;
	}
	@Override
	public String getDetails() {
		return super.getDetails() + " " + subjectTaught;
	}
}

package librarydatabase;

public abstract class Resource {
	
	private String title;
	private String dateOfPublication;
		
	public Resource(String title, String dateOfPublication) {
		
		this.title = title;
		this.dateOfPublication = dateOfPublication;
	}
	
	public String getDetails() {
		String details = title + dateOfPublication;
		return details;
	}
}

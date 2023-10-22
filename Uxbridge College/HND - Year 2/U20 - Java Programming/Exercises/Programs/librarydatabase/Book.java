package librarydatabase;

public class Book extends Resource{
	
	private String author;
	private String topic;
	private String synopsis;
	
	public Book(String title, String author, String topic, String synopsis, String dateOfPublication) {
		
		super(title, dateOfPublication);
		this.author = author;
		this.topic = topic;
		this.synopsis = synopsis;
	}
	
	@Override
	public String getDetails() {
		
		return super.getDetails() + " " + author + " " + topic + " " + synopsis;
	}
}

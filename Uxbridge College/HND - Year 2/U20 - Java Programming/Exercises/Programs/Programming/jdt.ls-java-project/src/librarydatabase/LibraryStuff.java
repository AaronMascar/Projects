public class LibraryStuff extends Member {
  // attributes
  String jobtitle;

  // constructor method
public LibraryStaff(int id, String firstName, String lastName, String jobTitle) {
  super(id, firstName, lastName);
  this.jobTitle = jobTitle;
}

  // getter and setter methods
  public Book buyBook(String title, Sting author, String topic, String synopsis) {
    return new Book(title, author, topic, synopsis);
  }

  @Override
  public String getDetials() {

    String details = super.getDetials() + jobTitle;
    return details;

  }
}
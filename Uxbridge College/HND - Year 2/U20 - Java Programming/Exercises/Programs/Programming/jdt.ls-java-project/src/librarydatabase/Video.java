public class Video extends Resource {

private String director, genre, cast;

public Video(String title, String director, String genre, String cast, String dateOfPublication,) {
  super(title, dateOfPublication);
  this.director = director;
  this.genre = genre;
  this.cast = cast;  
}
@Override
public String getDetails(){
  return director + genre + cast + super.getDetials();
}
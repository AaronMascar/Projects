package librarydatabase;

import java.util.ArrayList;

public class Database {

private ArrayList<Member> members = new ArrayList<>();
  //declare an arrayList for resourse
private ArrayList<Resource> resources = new ArrayList<>();

  public void addMember(Member m)  {
      members.add(m);
  }
  //write a method to ass resources

  public void addResource(Resource r)  {
      resources.add(r);
      
  }
  public void printMembers() {
    for(Member m : members) {
      System.out.println(m.getDetails());
    }
}
  //write a method to print the resources
  
  public void printResource() {
    for(Resource r : resources) {
      System.out.println(r.getDetails());
        }
    }
}
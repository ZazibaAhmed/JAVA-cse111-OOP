public class Student implements StInterface {
  public String name,ID,addressField;
  public void setName(String a) {
    name=a;
  }
  public void setID(String b) {
   ID=b;
  }
  public String getName() {
    return name;
  }
  public String getID() {
    return ID;
  }
}
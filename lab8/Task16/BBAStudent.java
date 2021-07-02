public class BBAStudent extends Student{
    private String dep="BBA";
    public BBAStudent(){
      setName("Default BBA Student");
    }
    public BBAStudent(String n){
      setName(n);
    } 
    
  public String toString(){
    return "Name : " + getName() + " Department: " + dep;
  }
}
public class Student
{
    public String name,id,address;
    public double cgpa;
    public Student(){
    }
    public Student(String n,String i,String a,double c){
        name=n;
        id=i;
        address=a;
        cgpa=c;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setID(String i){
        id=i;
    }
    public String getID(){
        return id;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address=a;
    }
    public double getCGPA(){
        return cgpa;
    }
    public void setCGPA(double c){
        cgpa=c;
    }
}

                                 



    
    
    
    
    
    

   
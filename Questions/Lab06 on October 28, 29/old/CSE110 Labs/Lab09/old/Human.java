public class Human{
 private int age;
 public double height;
 public void setAge(int x){
     if(x>=0){
         age = x;
     }
 }
 public int ageDao(){
     return age;
 }
}

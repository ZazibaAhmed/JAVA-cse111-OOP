public class StringMethodsTest{
  String s;
  /*This is the constructor
   */
  public StringMethodsTest(String s){
    this.s=s;
  }
  
  public static void main (String[]args){
    StringMethodsTest s1 = new StringMethodsTest("ABCDE");
    System.out.println(s1.length());// This should print 5
  }
  public int length (){
    //Write your code here!
    
    return -1;//remove this line
  }
}
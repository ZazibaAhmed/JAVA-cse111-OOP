public class A{
  public static void main(String []args){
    
    String s1="Zoo";
    String s2="animal";
    
    int value;
    value=s1.compareToIgnoreCase(s2);
    //System.out.println(value);
    if(value > 0){
      System.out.println("Dictionary tay, "+s1+" pore, "+s2+" aage");
    }else if(value == 0){
      System.out.println("Dictionary tay, "+s1+" eebong "+s2+" pashapashi");
    }else{
      System.out.println("Dictionary tay, "+s1+" aage, "+s2+" pore");
    }
    
  }
}

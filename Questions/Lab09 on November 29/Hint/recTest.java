import java.util.*;
class recTest{
  public void printten(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    else{
      System.out.println(n);
      printten(n-1);
      
    }
    
  }
    
  
  
}
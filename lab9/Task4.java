import java.util.*;
  public class Task4 { 
  public static void main(String [] args) {
  String s="23 99 8 20 32"; 
  int sum=0;
  StringTokenizer k6=new StringTokenizer(s," "); 
        while(k6.hasMoreTokens()){ 
          String j=(String)(k6.nextToken());
          int h=Integer.parseInt(j);
          sum=sum+h;
        }
            System.out.println(sum);
}
}
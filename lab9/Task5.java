import java.util.*;
  public class Task5 { 
  public static void main(String [] args) {
  String s="23 99 8 20 32"; 
  int sum=0;
            String [] a=s.split(" ");
            for(int i=0;i<a.length;i++) {
              int q=Integer.parseInt(a[i]);
              sum=sum+q;
            }
            System.out.println(sum);
        }
}
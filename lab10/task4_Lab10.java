import java.util.Scanner;
public class task4_Lab10{
  public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int x,n;
     try{
       n=sc.nextInt();
        
     }
     catch(Exception d){
       n=9;
       System.out.println (d);
     }
     int a[]=new int[n];
    try{
      a[5]=99;
    }
    catch(Exception c){
     System.out.println(c);
    }
    
    try{
      x=n/0;
    }
    
    catch(Exception b){
      System.out.println(b);
    }
   
   
  }
}
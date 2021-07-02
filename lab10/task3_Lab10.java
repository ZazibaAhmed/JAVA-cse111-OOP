import java.util.Scanner;
public class task3_Lab10{
  public static void main(String []args){
     Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
    try{
      a[5]=99;
    }
    catch(ArrayIndexOutOfBoundsException c){
      
      System.out.println(c);
      
    }
    try{
      x=n/0;
    }
    
    catch(ArithmeticException b){
      System.out.println(b);
    }
  }
}
  

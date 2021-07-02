import java.util.*;
public class Task3LAB5{
    public static void main(String [] args)
   {
      System.out.println("Enter a number");
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       int x=0;
       for(int i=0;i<a.length();i++)
       {
           x=x+a.charAt(i);
       }
       if(x%3==0)
       {
           System.out.print(a+" is divisible by 3");
       }
       else
       {
           System.out.print(a+" is not divisible by 3");
       }
           
    }
}
           
           
               
import java.util.*;
public class Task2LAB5{
    public static void main(String [] args)
   {
      System.out.println("Enter a string");
       Scanner sc=new Scanner(System.in);
       String word=sc.nextLine();
        String output="";
        output=output+word.charAt(0);
       
       
       for(int i=1;i<word.length();i++)
       {
           
           if(word.charAt(i)!=word.charAt(i-1))
           {
               output=output+word.charAt(i);
           }
       }
       System.out.print(output);
       sc.close();
    }
}
           
      
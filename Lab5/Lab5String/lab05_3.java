import java.util.Scanner;
public class lab05_3
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Please input number");
    String s=sc.nextLine();
    int sum=0;
    char [] array=s.toCharArray();
    int [] asc=new int [array.length];
    
    for (int i=0; i<array.length; i++)
    {
        
        asc[i]=((int)array[i]-48);
        
    }
    
    for (int k=0; k<array.length; k++)
    {
        sum=sum+asc[k];
    }
    
    System.out.println ("Sum of numbers = "+sum);
    if (sum%3==0)
    {
        System.out.println ("The number is divisible by 3");
    }
    else
    {
        System.out.println ("The number is NOT divisible by 3");
    }
        
    
    sc.close();
  }
}
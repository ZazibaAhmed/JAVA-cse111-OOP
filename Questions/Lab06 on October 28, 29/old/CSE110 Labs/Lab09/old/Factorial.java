import java.util.Scanner;

public class Factorial
{  
  public static int fac(int n)
      
  {
      if (n==1) 
          return 1;
      else 
          return n*(fac(n-1));
  
  
  }
      
    
    public static void main(String args[])
  {
    Scanner keyboard = new Scanner ( System.in );

    System.out.println("Please Enter an int");
    int x; 
    x = keyboard.nextInt();
    System.out.println(x);

    System.out.println(fac(x));
  }
}


import java.util.Scanner;

public class InputExample
{  
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner ( System.in );

    System.out.println("Please Enter an int");
    int x; 
    x = keyboard.nextInt();
    System.out.println(x);

    System.out.println("Please Enter a float");
    float y;
    y = keyboard.nextFloat();
    System.out.println(y);

    System.out.println("Please Enter a double");
    double d;
    d = keyboard.nextDouble();
    System.out.println(d);
  }
}


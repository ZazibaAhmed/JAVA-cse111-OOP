import java.util.Scanner;
  public class Task5Lab3o
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the voltage");
    double E=sc.nextDouble();
    System.out.println("Enter the resistance");
    double R=sc.nextDouble();
    System.out.println("Enter the inductance");
    double L=sc.nextDouble();
    System.out.println("Enter the capacitance");
    double C=sc.nextDouble();
    System.out.println("Enter the frequency");
    double f=sc.nextDouble();
    double I=E/(Math.sqrt(Math.pow(R,2)+Math.pow((2*(Math.PI)*f*L-(1/(2*(Math.PI)*f*C))),2)));
    System.out.println(I);
   }
}
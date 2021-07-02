import java.util.Scanner;
public class Task7Lab2
{
    public static void main(String []args)
    {
        System.out.print("Enter 10 numbers");
        Scanner keyboard=new Scanner(System.in);
        int a[]=new int[10];
        
        for(int i=0;i<a.length;i++)
        {
           a[i]=keyboard.nextInt();
           for(int j=0;j<=i;j++)
           {
               System.out.print(a[j]+",");
           }
        }
    }
}
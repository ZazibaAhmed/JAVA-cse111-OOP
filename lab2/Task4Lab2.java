import java.util.Scanner;
public class Task4Lab2
{
    public static void main(String []args)
    {
        System.out.print("Enter 20 numbers");
        Scanner keyboard=new Scanner(System.in);
        int a[]=new int[20];
        for(int i=0;i<a.length;i++)
        {
            a[i]=keyboard.nextInt();
        }
        for(int j=19;j>=0;j--)
        {
            if(a[j]%2==0)
            {
            System.out.println(a[j]);
                
                
            }
        }
    }
}
        
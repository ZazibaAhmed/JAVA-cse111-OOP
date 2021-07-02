import java.util.Scanner;
public class Task9Lab2
{
    public static void main(String []args)
    {
        System.out.print("Enter 10 numbers");
        Scanner keyboard=new Scanner(System.in);
        int a[]=new int[10];
        
        for(int i=0;i<a.length;i++)
        {
           a[i]=keyboard.nextInt();
        }
        for(int j=0;j<a.length;j++)
        {
            if(!(a[j]%2==0))
            {
                System.out.print(a[j]+",");
            }
        }
         for(int k=0;k<a.length;k++)
        {
            if((a[k]%2==0))
            {
                System.out.print(a[k]+",");
            }
        }
    }
}

          
          
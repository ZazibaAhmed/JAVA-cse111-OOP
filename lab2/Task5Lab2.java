import java.util.Scanner;
public class Task5Lab2
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
        System.out.print("Enter another number");
        int y=keyboard.nextInt();
        boolean x=false;
        int j=0;
        while(j<a.length)
        {
            if(a[j]==y)
            {
                x=true;
               
            }
            j++;
        }
        if(x==true)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}

            
            
            
            
            
            
            
            
            
            
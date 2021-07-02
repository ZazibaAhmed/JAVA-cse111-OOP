import java.util.Scanner;
public class Task8Lab3o
{
    public static void main(String []args)
    {
        System.out.println("Enter 10 numbers between 0-9");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        
        for(int count=0;count<10;count++)
        {
            int index=sc.nextInt();
            a[index]=a[index]+1;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=2&&a[i]<=5)
            {
                System.out.print(i+",");
            }
    }
}
}

   
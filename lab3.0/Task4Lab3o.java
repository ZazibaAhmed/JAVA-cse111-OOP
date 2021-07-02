import java.util.Scanner;
public class Task4Lab3o
{
    public static void main(String []args)
    {
        System.out.print("Enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        int []a=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]+" is already among the entered numbers,please enter a new number");
                    a[i]=sc.nextInt();
                }
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+",");
        }
    }
}
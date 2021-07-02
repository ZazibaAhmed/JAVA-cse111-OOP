import java.util.Scanner;
public class Task2LAB3o
{
    public static void main(String []args)
    {
        System.out.println("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
          for(int count=0;count<=i;count++)
          {
              if(count==0)
              {
                  System.out.print("You have entered ");
              }
             System.out.print(a[count]+",");
          }
          System.out.println();
        }
    }
}
            
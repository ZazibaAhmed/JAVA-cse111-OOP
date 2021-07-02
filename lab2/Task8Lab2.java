import java.util.Scanner;
public class Task8Lab2
{
    public static void main(String []args)
    {
        System.out.print("Enter 10 numbers");
        Scanner keyboard=new Scanner(System.in);
        int a[]=new int[10];
        
        for(int i=0;i<a.length;i++)
        {
           a[i]=keyboard.nextInt();
           for(int j=0;j<i;j++)
           {
              if(a[i]==a[j])
              {
                  System.out.println("Enter another number");
                  a[i]=keyboard.nextInt();
              }
           }
        }
        for(int g=0;g<a.length;g++)
        {
            System.out.println(a[g]);
        }
    }
}

            
            
            
            
            
            
            
            
           
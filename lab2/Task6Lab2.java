import java.util.Scanner;
public class Task6Lab2
{
    public static void main(String []args)
    {
        System.out.print("Enter 15 numbers");
        Scanner keyboard=new Scanner(System.in);
        int a[]=new int[10];
        
        for(int i=0;i<15;i++)
        {
            int b=keyboard.nextInt();
            a[b]=a[b]+1;
        }
            
            
       
        for(int j=0;j<a.length;j++)
        {
            System.out.println(j+"="+a[j]);
        }
    }
}
                
            
       
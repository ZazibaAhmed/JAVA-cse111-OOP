import java.util.Scanner;
public class task10Lab3o
{
    public static void main(String []args)
    {
        System.out.println("Enter 15 numbers between 0-9");
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        
        for(int count=0;count<15;count++)
        {
            int index=sc.nextInt();
            a[index]=a[index]+1;
        }
        int i=0;
        while(i<a.length)
        { 
            if(a[i]>=2&&a[i]<=5)
            {
                System.out.print(i+",");
                break;
            }
            i++;
            
        }
        i++;
         while(i<a.length)
        { 
            if(a[i]>=2&&a[i]<=5)
            {
                System.out.print(i+",");
                break;
            }
         }
    }
}






            
            
        
        
            
            
            
            
            
            
            
            
            
    
    

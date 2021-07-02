import java.util.Scanner;
public class Task6Lab3o
{
    public static void main(String []args)
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double y=0;
        for(int a=1;a<=n;a++)
        {
            int sign;
            if(a%2==0)
            {
               sign=-1;
            }
            else
            {
                sign=1;
            }
            y=y+sign*(Math.pow(a,2));
        }
        System.out.println(y);
    }
}
            
                
                
               
             
                
        
        
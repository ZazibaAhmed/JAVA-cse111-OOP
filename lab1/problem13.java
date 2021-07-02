import java.util.*;
public class problem13
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int a=1;a<=n;a++)
        {
            System.out.print(a);
        }
        for(int b=n-1;b>0;b--)
        {
            System.out.print(b);
        }
    }
}
     

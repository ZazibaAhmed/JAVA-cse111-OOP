import java.util.*;
public class problem14
{
    public static void main(String []args)
    {
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int m=1;
        for(int line=1;line<=row;line++)
        {
          for(int x=line;x<row;x++)
          {
              System.out.print(" ");
          }
          for(int x=1;x<=line;x++)
          {
              System.out.print(x);
              
          }
          if(!(line==1))
          {
             int n=m;
             for(int y=1;y<line;y++)
             {
                 System.out.print(n);
                 n--;
             }
             m++;
          }
          System.out.println();
        }
    }
}
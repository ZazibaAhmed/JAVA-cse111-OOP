import java.util.*;
public class problem11
{
  public static void main(String []args)
  {
    System.out.println("Enter height");
    Scanner keyboard=new Scanner(System.in);
    int height=keyboard.nextInt();
   
    for(int line=1;line<=height;line++)
    {
        for(int x=line;x<height;x++)
        {
            System.out.print(" ");
        }
        if(line==1||line==height)
        {
            for(int a=1;a<=line;a++)
            {
                System.out.print(a);
            }
        }
        else
        {
            System.out.print("1");
            for(int b=1;b<=line-1;b++)
            {
                System.out.print(" ");
            }
        }
       
     if(line==height)
        {
            int m=height+1;
            for(int i=1;i<=line-1;i++)
            {
                System.out.print(m);
                m++;
            }
        }
        else
        {
            if(!(line==1))
            {
           
            for(int j=1;j<=line-2;j++)
            {
                System.out.print(" ");
                
            }
            System.out.print(line+line-1);
           
        }
        System.out.println();
    }
  }
}
}

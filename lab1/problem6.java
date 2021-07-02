import java.util.*;
public class problem6
{
  public static void main(String []args)
  {
    System.out.println("Enter height");
    Scanner keyboard=new Scanner(System.in);
    int height=keyboard.nextInt();
   
    for(int line=1;line<=height;line++)
    {
        for(int i=line;i<=height-1;i++)
        {
            System.out.print(" ");
        }
       
        for(int j=1;j<=line;j++)
        {
            System.out.print(j);
        }
        
        if(!(line==1))
        {
            int m=line;
            for(int k=1;k<line;k++)
            {
                System.out.print(m+1);
                m++;
            }
        }
        System.out.println();
    }
  }
}
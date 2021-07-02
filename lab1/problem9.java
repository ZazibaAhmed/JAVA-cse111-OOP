import java.util.*;
public class problem9
{
  public static void main(String []args)
  {
    System.out.println("Enter height");
    Scanner keyboard=new Scanner(System.in);
    int height=keyboard.nextInt();
   
    for(int line=1;line<=height;line++)
    {
        if(line==1||line==2||line==height)
        {
            for(int a=1;a<=line;a++)
            {
                System.out.print(a);
            }
        }
        else
        {
            System.out.print("1");
            for(int b=1;b<=line-2;b++)
            {
                System.out.print(" ");
            }
            System.out.print(line);
        }
        System.out.println();
    }
  }
}
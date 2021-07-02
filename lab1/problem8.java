import java.util.*;
public class problem8
{
  public static void main(String []args)
  {
    System.out.println("Enter height and width");
    Scanner keyboard=new Scanner(System.in);
    int height=keyboard.nextInt();
    int width=keyboard.nextInt();
    for(int line=1;line<=height;line++)
    {
        if(line==1||line==height)
        {
            
            for(int a=1;a<=width;a++)
            {
            System.out.print(a);
            }
        }
        else
        {
            System.out.print("1");
            
            for(int b=1;b<=width-2;b++)
            {
                System.out.print(" ");
            }
            System.out.print(width);
        }
        System.out.println();
    }
  }
}
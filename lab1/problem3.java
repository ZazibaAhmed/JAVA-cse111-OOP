import java.util.*;
public class problem3
{
  public static void main(String []args)
  {
    System.out.println("Enter height");
    Scanner keyboard=new Scanner(System.in);
    int height=keyboard.nextInt();
   
    for(int line=1;line<=height;line++)
    {
        for(int width=1;width<=line;width++)
        {
                
            System.out.print(width);
        }
        System.out.println();
    }
  }
}
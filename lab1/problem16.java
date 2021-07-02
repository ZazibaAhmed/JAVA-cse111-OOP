import java.util.*;
public class problem16
{
  public static void main(String []args)
  {
    System.out.println("Enter row and column");
    Scanner keyboard=new Scanner(System.in);
    int row=keyboard.nextInt();
    int column=keyboard.nextInt();
    for(int line=1;line<=row;line++)
    {
        for(int width=1;width<=column;width++)
        {
                
            System.out.print("*");
        }
        System.out.println();
    }
  }
}
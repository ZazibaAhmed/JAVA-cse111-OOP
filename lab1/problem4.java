import java.util.*;
public class problem4
{
    public static void main(String []args)
    {
        System.out.print("Enter height");
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int z=height;
        for(int line=1;line<=height;line++)
        {
          for(int x=line;x<height;x++)
          {
              System.out.print(" ");
          }
          for(int y=z;y<=height;y++)
          {
              System.out.print(y);
          }
           System.out.println();
           z--;
        }
    }
}
  

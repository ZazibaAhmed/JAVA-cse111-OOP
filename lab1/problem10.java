import java.util.*;
public class problem10
{
    public static void main(String []args)
    {
        System.out.print("Enter the height");
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int x=height;
        for(int line=1;line<=height;line++)
        {
            for(int a=line;a<height;a++)
            {
                System.out.print(" ");
            }
            if(line==1||line==2||line==height)
            {
                int y=x;
                for(int b=1;b<=line;b++)
                {
                    System.out.print(y);
                    y++;
                }
            }
            else
            {
                System.out.print(line);
                for(int c=1;c<=line-2;c++)
                {
                    System.out.print(" ");
                }
                System.out.print(height);
            }
            System.out.println();
            x--;
        }
    }
}

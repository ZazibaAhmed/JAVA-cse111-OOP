import java.util.Scanner;
public class problem7
{
    public static void main(String []args)
    {
      System.out.print("Enter a number");
      Scanner keyboard=new Scanner(System.in);
      int input=keyboard.nextInt();
      for(int line=1;line<=input;line++)
      {
          for(int i=line;i<input;i++)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=line;j++)
          {
              System.out.print(j);
          }
          if(!(line==1))
          {
              int c=line+1;
              for(int k=1;k<line;k++)
              {
                                 
                  System.out.print(c);
                  c++;
                  }
              }
          
          System.out.println();
      }
       for(int x=1;x<input;x++)
      {
          for(int y=1;y<=x;y++)
          {
              System.out.print(" ");
          }
          int m=1;
          for(int z=x;z<input;z++)
          {
              System.out.print(m);
              m++;
          }
          int n=m;
          for(int a=x+1;a<input;a++)
          {
              System.out.print(n);
              n++;
          }
          System.out.println();
      }
    }
}
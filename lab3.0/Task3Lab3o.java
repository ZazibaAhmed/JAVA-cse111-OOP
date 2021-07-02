import java.util.Scanner;
public class Task3Lab3o
{
    public static void main(String []args)
    {
        System.out.println("Enter 10 numbers");
        Scanner keyboard=new Scanner(System.in);
        int []array=new int[10];
        for(int i=0;i<array.length;i++)
        {
           array[i]=keyboard.nextInt();
        }
        int count=0;
        while(count<array.length)
            
        {
          int largest=array[count],largestsource=count,index=largestsource;
          while(index<array.length)
          {
              if(array[index]>largest)
              {
                  largest=array[index];
                  largestsource=index;
              }
              index++;
          }
          array[largestsource]=array[count];
          array[count]=largest;
          count++;
        }
          for(int x=0;x<array.length;x++)
        {
            System.out.print(array[x]+",");
        }
    }
}
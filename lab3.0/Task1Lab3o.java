import java.util.Scanner;
public class Task1Lab3o
{
    public static void main(String []args)
    {
        System.out.println("Enter 10 numbers");
        Scanner keyboard=new Scanner(System.in);
        int []number=new int[10];
        for(int index=0;index<10;index++)
        {
            number[index]=keyboard.nextInt();
        }
        for(int i=9;i>=0&&i<10;i--)
        {
            System.out.println(number[i]);
        }
    }
}